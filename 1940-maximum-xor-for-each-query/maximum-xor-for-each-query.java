class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int n=nums.length;
        int ans[]=new int[n];
        int xor=0, max=(int)Math.pow(2,maximumBit)-1;
        for(int i=0;i<n;i++){
            xor^=nums[i];
        }
        for(int i=0;i<n;i++){
            ans[i]=(xor^max);
            xor^=nums[n-i-1];
        }
        return ans;
    }
}
