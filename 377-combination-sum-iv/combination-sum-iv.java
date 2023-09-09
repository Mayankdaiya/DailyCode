class Solution {
    public int combinationSum4(int[] nums, int t) {
        int arr[]=new int[t+1];
        arr[0]=1;
        for(int i=1;i<=t;i++){
            for(int j=0;j<nums.length;j++){
                if(i>=nums[j]){
                    arr[i]+=arr[i-nums[j]];
                }
            }
        }
        return arr[t];
    }
}