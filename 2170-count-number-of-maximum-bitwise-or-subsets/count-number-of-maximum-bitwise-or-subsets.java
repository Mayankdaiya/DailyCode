class Solution {
    static int res;
    public int countMaxOrSubsets(int[] nums) {
        int target=0;
        for(int i=0;i<nums.length;i++) target=target|nums[i];
        res=0;
        getCount(nums,0,0,target);
        return res;
    }
    public void getCount(int nums[],int in,int cur,int target){
        if(cur==target) res++;
        for(int i=in;i<nums.length;i++){
            getCount(nums,i+1,cur|nums[i],target);
        }
    }
}