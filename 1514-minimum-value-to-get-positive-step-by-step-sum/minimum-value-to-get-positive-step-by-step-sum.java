class Solution {
    public int minStartValue(int[] nums) {
        int min=nums[0];
        for(int i=1;i<nums.length;i++){
            nums[i]+=nums[i-1];
            if(min>nums[i]) min=nums[i];
        }
        if(min<0){
            min*=-1; min++;
        } else min=1;
        return min;
    }
}