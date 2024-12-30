class Solution {
    public int countGoodStrings(int low, int high, int zero, int one) {
        int dp[]=new int[high+1];
        dp[zero]++; dp[one]++;
        int res=0, mod=1000000007;
        for(int i=Math.min(zero,one);i<=high;i++){
            if(dp[i]>0){
                if(i+zero<=high){
                    dp[i+zero]+=dp[i];
                    dp[i+zero]%=mod;
                } 
                if(i+one<=high){
                    dp[i+one]+=dp[i];
                    dp[i+one]%=mod;
                } 
            }
        }
        for(int i=low;i<=high;i++){
            res=(res+dp[i])%mod;
        }
        return res;
    }
}