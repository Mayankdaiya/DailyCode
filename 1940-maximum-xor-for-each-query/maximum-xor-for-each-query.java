class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int xor=0, max=(int)Math.pow(2,maximumBit)-1;
        for(int i:nums) xor^=i;
        int res[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            res[i]=xor^max;
            xor^=nums[nums.length-i-1];
        }
        return res;
    }
}