class Solution {
    public long mostPoints(int[][] questions) {
        long dp[]=new long[questions.length];
        Arrays.fill(dp,-1);
        return dfs(questions,dp,0);
    }
    public long dfs(int ques[][],long dp[],int i){
        if(i>=ques.length) return 0;
        if(dp[i]!=-1) return dp[i];
        long point=ques[i][0];
        int skip=ques[i][1];
        return dp[i]=Math.max(point+dfs(ques,dp,i+skip+1),dfs(ques,dp,i+1)); 
    }
}