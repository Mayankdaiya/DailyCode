class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int res=1, inc=1, dec=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                res=Math.max(res,dec);
                dec=1; inc++;
            } else if(nums[i]<nums[i-1]){
                res=Math.max(res,inc);
                inc=1; dec++;
            } else {
                res=Math.max(res,Math.max(inc,dec));
                inc=1; dec=1;
            }
        }
        return Math.max(res,Math.max(inc,dec));
    }
}