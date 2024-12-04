class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int n=str1.length(), m=str2.length();
        if(n<m) return false;
        int i=0, j=0;
        while(i<n && j<m){
            int t=str2.charAt(j)-str1.charAt(i);
            if((t==0 || t==1) || (str1.charAt(i)=='z' && str2.charAt(j)=='a')) j++;
            i++;
        }
        if(j==m) return true;
        return false;
    }
}