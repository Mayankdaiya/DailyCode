class Solution {
    public int findMaxK(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0) set.add(nums[i]);
        }
        int max=-1;
        for(int i=0;i<nums.length;i++){
            if(set.contains(-nums[i])){
                max=Math.max(max,-nums[i]);
            }
        }
        return max;
    }
}