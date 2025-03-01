class Solution {
    public int[] applyOperations(int[] nums) {
        int c=0;
        if(nums[0]==0) c++;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                nums[i-1]*=2;
                nums[i]=0;
            }
            if(nums[i]==0) c++;
        }
        int in=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                if(in==-1 || in<i+1) in=i+1;
                while(in<nums.length && nums[in]==0){
                    in++;
                }
                if(in<nums.length){
                    nums[i]=nums[in];
                    nums[in]=0;
                } else break;
            }
        }
        return nums;
    }
}