class Solution {
    static int dp[]=new int[38];
    public int tribonacci(int n) {
        if(n==0) return 0;
        dp[1]=1; dp[2]=1; 
        return get(n);
    }
    public static int get(int n){
        if(n==0 || dp[n]!=0) return dp[n];
        return dp[n]=get(n-1)+get(n-2)+get(n-3);
    }
}