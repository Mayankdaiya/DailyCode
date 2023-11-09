class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0, in=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) in=-1;
            else{
                if(in==-1) in=i;
                max=Math.max(max,i-in+1);
            }
        }
        return max;
    }
}