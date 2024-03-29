class Solution {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        long sum=0;
        for(int el:nums){
            sum+=el;
        }
        for(int i=nums.length-1;i>=2;i--){
            sum-=nums[i];
            if(nums[i]<sum) return sum+=nums[i];
        }
        return -1;
    }
}