class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int arr[]=new int[nums.length];
        arr[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            arr[i]=arr[i-1]^nums[i];
        }
        for(int i=0;i<nums.length;i++){
            int t=arr[nums.length-i-1], ans=0;
            for(int j=maximumBit-1;j>=0;j--){
                int bit=1<<j;
                if((bit^t)>=t){
                    t=t^bit;
                    ans+=bit;
                }
            }
            nums[i]=ans;
        }

        return nums;
    }
}