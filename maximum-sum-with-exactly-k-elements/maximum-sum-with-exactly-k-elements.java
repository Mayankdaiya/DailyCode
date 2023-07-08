class Solution {
    public int maximizeSum(int[] nums, int k) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max) max=nums[i];
        }
        int n=max, m=n+k-1;
        int t=(m)*(m+1)/2-(n-1)*(n)/2;
        return t;
    }
}