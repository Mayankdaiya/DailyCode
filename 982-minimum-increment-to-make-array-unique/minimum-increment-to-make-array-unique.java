class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int res=0, num=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>num) num=nums[i];
            res+=num-nums[i];
            num++;
        }
        return res;
    }
}