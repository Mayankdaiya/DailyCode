class Solution {
    public int[] rearrangeArray(int[] nums) {
        int ans[]=new int[nums.length];
        int p=0, n=0, in=0;
        for(int i=0;i<nums.length/2;i++){
            while(p<nums.length){
                if(nums[p]>0) break;
                p++;
            }
            ans[in++]=nums[p++];
            while(n<nums.length){
                if(nums[n]<0) break;
                n++;
            }
            ans[in++]=nums[n++];
        }
        return ans;
    }
}