class Solution {
    public int minimumDistance(int[] nums) {
        int res = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]!=nums[j]) continue;
                for(int k=j+1;k<nums.length;k++){
                    if(nums[k]!=nums[i]) continue;
                    else res = Math.min(res, 2*(k-i));
                }
            }
        }
        return res==Integer.MAX_VALUE?-1:res;
    }
}