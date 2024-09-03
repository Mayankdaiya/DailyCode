class Solution {
    public int getLucky(String s, int k) {
        StringBuilder str=new StringBuilder();
        for(int i=0;i<s.length();i++){
            str.append((int)(s.charAt(i)-'a')+1);
        }
        s=str.toString();
        int res=0;
        for(int i=0;i<s.length();i++){
            res+=(s.charAt(i)-'0');
        }
        while(k-->1){
            if(res<10) break;
            int cur=0;
            while(res>0){
                cur+=res%10;
                res/=10;
            }
            res=cur;
        }
        return res;
    }
}