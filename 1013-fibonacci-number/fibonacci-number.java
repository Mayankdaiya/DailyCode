class Solution {
    static int dp[]=new int[31];
    public int fib(int n) {
        if(n==0) return 0;
        dp[1]=1; dp[2]=1;
        return get(n);
    }
    public static int get(int n){
        if(dp[n]!=0) return dp[n];
        return dp[n]=dp[n-1]+dp[n-2];
    }
}