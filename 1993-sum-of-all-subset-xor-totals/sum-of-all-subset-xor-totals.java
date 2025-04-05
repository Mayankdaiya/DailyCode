class Solution {
    public int subsetXORSum(int[] nums) {
        return getXor(nums,0,0);
    }
    public int getXor(int nums[],int in,int xor){
        if(in==nums.length){
            return xor;
        }
        return getXor(nums,in+1,xor^nums[in])+getXor(nums,in+1,xor);
    }
}