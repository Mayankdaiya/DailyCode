class Solution {
    public int numDecodings(String s) {
        int dp[] = new int[s.length()];
        return solve(s,dp,0);
    }

    public static int solve(String s, int dp[], int i){
        if(i==s.length()) return 1;
        if(s.charAt(i)=='0') return 0;
        if(dp[i]!=0) return dp[i];
        int t = solve(s,dp,i+1);
        if(i+1<s.length()){
            int num = Integer.parseInt(s.substring(i,i+2));
            if(num>9 && num<27) t += solve(s,dp,i+2);
        }
        return dp[i]=t;
    }
}