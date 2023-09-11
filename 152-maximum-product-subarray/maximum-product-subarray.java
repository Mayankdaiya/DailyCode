class Solution {
    public int maxProduct(int[] nums) {
        int pre=1, suf=1, ans=Integer.MIN_VALUE, n=nums.length-1;
        for(int i=0;i<=n;i++){
            if(pre==0) pre=1;
            if(suf==0) suf=1;
            pre*=nums[i]; suf*=nums[n-i];
            ans=Math.max(ans,Math.max(pre,suf));
        }
        return ans;
    }
}