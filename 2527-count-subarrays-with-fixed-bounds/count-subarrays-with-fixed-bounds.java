class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long count=0, st=-1, min=-1, max=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<minK || nums[i]>maxK) st=i;
            if(nums[i]==maxK) max=i;
            if(nums[i]==minK) min=i;
            long valid=Math.max(0L,Math.min(min,max)-st);
            count+=valid;
        }
        return count;
    }
}