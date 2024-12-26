class Solution {
    static int totalsum;
    public int findTargetSumWays(int[] nums, int target) {
        totalsum=Arrays.stream(nums).sum();
        int dp[][]=new int[nums.length][totalsum*2+1];
        for(int row[]:dp){
            Arrays.fill(row,Integer.MIN_VALUE);
        }
        return solve(nums,0,0,target,dp);
    }
    public static int solve(int nums[],int in,int sum,int target,int dp[][]){
        if(in==nums.length){
            if(sum==target) return 1;
            else return 0;
        } 
        if(dp[in][sum+totalsum]!=Integer.MIN_VALUE) return dp[in][sum+totalsum];
        return dp[in][sum+totalsum]=solve(nums,in+1,sum+nums[in],target,dp)+solve(nums,in+1,sum-nums[in],target,dp);
    }
}