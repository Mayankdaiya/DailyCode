class Solution {
    public int minExtraChar(String s, String[] dict) {
        int n = s.length();
        HashSet<String> set = new HashSet<>();
        for(String str: dict) set.add(str);
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        return solve(0,set,s,dp);
    }

    int solve(int in, HashSet<String> set, String s, int[] dp){
        if(in>=s.length()) return 0;
        if(dp[in]!=-1) return dp[in];
        int ans = Integer.MAX_VALUE;
        String sub = "";
        for(int i=0;i+in<s.length();i++){
            sub = s.substring(in, in + i + 1);
            if(set.contains(sub)){
                ans= Math.min(ans, solve(in+i+1,set,s,dp));
            }
            ans= Math.min(ans,i+1+solve(in+i+1, set, s, dp)); // yaha err tha
        } 
        return dp[in] = ans;
    }
}