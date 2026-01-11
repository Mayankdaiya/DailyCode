class Solution {
    public int thirdMax(int[] nums) {
        long a=nums[0], b=Long.MIN_VALUE, c=b;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>a){
                c=b;
                b=a;
                a=nums[i];
            } else if(nums[i]>b && nums[i]!=a) {
                c=b;
                b=nums[i];
            } else if(nums[i]>=c && nums[i]!=a && nums[i]!=b) {
                c=nums[i];
            }
        }
        return c==Long.MIN_VALUE?(int)a:(int)c;
    }
}