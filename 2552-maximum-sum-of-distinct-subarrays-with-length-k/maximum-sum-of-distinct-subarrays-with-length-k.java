class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Set<Integer> set=new HashSet<>();
        long maxSum=0, curr=0;
        int i=0, j=0, len=0;
        while(j<nums.length){
            curr+=nums[j]; len++;
            if(set.contains(nums[j])){
                while(set.contains(nums[j])){
                    curr-=nums[i]; len--;
                    set.remove(nums[i]);
                    i++;
                }
                set.add(nums[j]);
            } else set.add(nums[j]);
            if(len>k){
                curr-=nums[i];
                set.remove(nums[i]);
                i++; len--;
            }
            if(len==k) maxSum=Math.max(curr,maxSum);
            j++;
        }
        return maxSum;
    }
}