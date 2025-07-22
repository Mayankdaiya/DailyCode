class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int i=0, in=0, sum=0, res=0;
        while(i<nums.length){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
                sum+=nums[i];
            } else {
                res=Math.max(res,sum);
                while(in<nums.length && set.contains(nums[i])){
                    sum-=nums[in];
                    set.remove(nums[in]);
                    in++;
                }
                set.add(nums[i]); sum+=nums[i];
            }
            i++;
        }
        return Math.max(sum,res);
    }
}