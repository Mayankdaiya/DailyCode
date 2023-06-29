class Solution {
    public String longestPrefix(String s) {
        return s.substring(0,longestSubstring(s));
    }
    public static int longestSubstring(String str){
        int len=str.length();
        int dp[]=new int[len];
        int cur=0;
        for(int i=1;i<len;){
            if(str.charAt(i)==str.charAt(cur)) {
                dp[i]=++cur;
                i++;
            } else{
                if(cur>0){
                    cur=dp[cur-1];
                } else{
                    dp[i]=0;
                    i++;
                }
            }
        }
        return dp[len-1];
    }
}