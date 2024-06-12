class Solution {
    public void sortColors(int[] nums) {
        int i=0, in=0, j=nums.length-1;
        while(i<=j){
            if(nums[i]==0){
                nums[i]=nums[in];
                nums[in]=0;
                in++; i++;
            } else if(nums[i]==2){
                nums[i]=nums[j];
                nums[j]=2;
                j--;
            } else {
                i++;
            }
        }
    }
}