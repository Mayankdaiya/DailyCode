class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        long pairs = 0;
        for(int in=0;in<nums.length-1;in++){
            //check for lower
            int t1=cal(nums,in+1,nums.length-1,lower-nums[in]);
            //check for upper
            int t2=cal(nums,in+1,nums.length-1,upper-nums[in]+1);
            pairs+=(t2-t1);
        }
        return pairs;
    }

    public int cal(int nums[],int i,int j,int val){
        while(i<=j){
            int idx=i+(j-i)/2;
            if(nums[idx]>=val){
                j=idx-1;
            } else {
                i=idx+1;
            } 
        }
        return i;
    }
}