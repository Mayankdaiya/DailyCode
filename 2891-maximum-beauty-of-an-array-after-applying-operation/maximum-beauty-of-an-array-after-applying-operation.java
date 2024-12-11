class Solution {
    public int maximumBeauty(int[] nums, int k) {
        Arrays.sort(nums);
        int res=1, i=0, cur=0;
        for(int j=0;j<nums.length;j++){
            while(i<j && Math.abs(nums[j]-nums[i])>2*k){
                i++;
            }
            res=Math.max(res,j-i+1);
        }
        return res;
    }
}