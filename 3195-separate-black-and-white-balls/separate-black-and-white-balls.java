class Solution {
    public long minimumSteps(String s) {
        long res=0;
        int i=s.length()-1, j=i;
        while(i>=0){
            char ch=s.charAt(i);
            if(ch=='1'){
                res+=(j-i);
                j--;
            }
            i--;
        }
        return res;
    }
}