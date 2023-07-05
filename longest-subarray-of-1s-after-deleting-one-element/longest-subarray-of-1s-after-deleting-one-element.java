class Solution {
    public int longestSubarray(int[] nums) {
        int count=0, t=0, f=0, in=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                t++;
            } else{
                if(f==0){
                    f=1; in=i;
                } else{
                    count=Math.max(count,t);
                    t=i-in-1; in=i;
                }
            }
        }
        count=Math.max(count,t);
        if(count==nums.length) return count-1;
        return count;
    }
}