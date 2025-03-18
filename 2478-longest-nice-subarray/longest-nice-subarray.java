class Solution {
    public int longestNiceSubarray(int[] nums) {
        int start=0, cur=nums[0], res=1;
        for(int i=1;i<nums.length;i++){
            int n=nums[i];
            while((cur&n)!=0){
                cur=cur^nums[start];
                start++;
            }
            res=Math.max(i-start+1,res);
            cur=cur|n;
        }
        return res;
    }
}