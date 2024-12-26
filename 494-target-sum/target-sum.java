class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return solve(nums,0,0,target);
    }
    public static int solve(int nums[],int in,int sum,int target){
        if(in==nums.length && sum==target) return 1;
        else if((in==nums.length && sum!=target) || in==nums.length) return 0;
        return solve(nums,in+1,sum+nums[in],target)+solve(nums,in+1,sum-nums[in],target);
    }
}