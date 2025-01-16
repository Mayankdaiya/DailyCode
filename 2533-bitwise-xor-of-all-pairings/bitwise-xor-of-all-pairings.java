class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int res=0;
        if(nums2.length%2==1) res=getXor(nums1,0);
        if(nums1.length%2==1) res=getXor(nums2,res);
        return res;
    }
    public static int getXor(int nums[], int xor){
        for(int i=0;i<nums.length;i++){
            xor^=nums[i];
        }
        return xor;
    }
}