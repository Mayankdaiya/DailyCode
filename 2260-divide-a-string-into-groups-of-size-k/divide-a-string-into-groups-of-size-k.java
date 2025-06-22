class Solution {
    public String[] divideString(String s, int k, char fill) {
        float l=(float)s.length()/k;
        int len=s.length()/k;
        if(l!=(float)len) len++;
        String res[]=new String[len];
        StringBuilder cur=new StringBuilder();
        int in=0;
        System.out.println(len);
        for(int i=0;i<s.length();i++){
            cur.append(s.charAt(i));
            if(cur.length()==k){
                res[in++]=cur.toString();
                cur.setLength(0);
            } 
        }
        while(cur.length()!=0){
            cur.append(fill);
            if(cur.length()==k){
                res[in]=cur.toString();
                break;
            }
        }
        return res;
    }
}