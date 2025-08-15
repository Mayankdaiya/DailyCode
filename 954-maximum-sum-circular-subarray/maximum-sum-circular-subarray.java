class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int max = nums[0], min = nums[0], cur1 = nums[0], cur2 = cur1, total = nums[0];
        for(int i=1;i<nums.length;i++){
            cur1 = Math.max(nums[i], nums[i]+cur1);
            max = Math.max(cur1,max);
            cur2 = Math.min(nums[i], nums[i]+cur2);
            min = Math.min(cur2,min);
            total += nums[i];
        }
        if(total!=min) max = Math.max(max, total-min);
        return max;
    }
}