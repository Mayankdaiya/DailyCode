class Solution {
    public int[] sortedSquares(int[] nums) {
        int arr[]=new int[10001];
        int len=0;
        for(int i=0;i<nums.length;i++){
            int t=nums[i];
            if(t<0) t*=-1;
            if(t>len) len=t;
            arr[t]++;
        }
        int in=0;
        for(int i=0;i<=len;i++){
            while(arr[i]-->0){
                nums[in++]=i*i;
            }
        }
        return nums;
    }
}