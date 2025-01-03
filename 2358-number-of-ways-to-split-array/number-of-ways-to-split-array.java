class Solution {
    public int waysToSplitArray(int[] nums) {
        int n=nums.length;
        long lSum=0, rSum=0;
        for(int i=0;i<n;i++){
            lSum+=nums[i];
        }
        int splits=0;
        for(int i=n-1;i>0;i--){
            rSum+=nums[i];
            lSum-=nums[i];
            if(lSum>=rSum) splits++;
        }
        return splits;
    }
}