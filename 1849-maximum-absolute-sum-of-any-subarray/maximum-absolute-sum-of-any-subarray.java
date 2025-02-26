class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int min=Integer.MAX_VALUE, max=Integer.MIN_VALUE;
        int psum=0, res=0;
        for(int i=0;i<nums.length;i++){
            psum+=nums[i];
            min=Math.min(min,psum);
            max=Math.max(max,psum);
            if(psum>=0){
                res=Math.max(res,Math.max(psum,psum-min));
            } else if(psum<=0){
                res=Math.max(res,Math.max(Math.abs(psum),Math.abs(psum-max)));
            }
        }
        return res;
    }
}