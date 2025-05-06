class Solution {
    public int[] buildArray(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int fin=nums[nums[i]]%1000;
            nums[i]=nums[i]+(1000*fin);
        }
        for(int i=0;i<nums.length;i++){
            nums[i]/=1000;
        }
        return nums;
    }
}