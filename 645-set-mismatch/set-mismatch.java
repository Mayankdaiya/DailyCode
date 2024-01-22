class Solution {
    public int[] findErrorNums(int[] nums) {
        boolean arr[]=new boolean[nums.length];
        int tw=0, mis=0;
        for(int i=0;i<nums.length;i++){
            int t=nums[i]-1;
            if(arr[t]) tw=t+1;
            else arr[t]=true;
        }
        for(int i=0;i<nums.length;i++){
            if(!arr[i]){
                mis=i+1;
                break;
            }
        }
        return new int[]{tw,mis};
    }
}