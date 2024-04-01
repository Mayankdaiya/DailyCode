class Solution {
    public int lengthOfLastWord(String s) {
        int n=s.length(), f=0;
        for(int i=n-1;i>=0;i--){
            if(f==0 && s.charAt(i)!=' '){
                f=1; n=i;
            }
            if(f==1 && s.charAt(i)==' '){
                return n-i;
            }
        }
        return f==0?0:n+1;
    }
}