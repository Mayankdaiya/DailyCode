class Solution {
    public int[] singleNumber(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])) set.remove(nums[i]);
            else set.add(nums[i]);
        }
        int res[]=new int[2];
        int in=0;
        for(int el:set){
            res[in++]=el;
        }
        return res;
    }
}