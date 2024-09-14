class Solution {
    public int longestSubarray(int[] nums) {
       int max=nums[0], c=1, res=1;
       for(int i=1;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
                c=1; res=1;
            } else if(nums[i]==max){
                if(nums[i]==nums[i-1]) c++;
                else {
                    res=Math.max(c,res);
                    c=1;
                }
            }
       } 
       return  Math.max(res,c);
    }
}