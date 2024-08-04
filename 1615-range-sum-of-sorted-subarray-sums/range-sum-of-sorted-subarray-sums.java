class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int s=n*(n+1)/2, in=0, res=0, mod=(int)Math.pow(10,9)+7;
        int arr[]=new int[s];
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=nums[j];
                arr[in++]=sum;
            }
        }
        Arrays.sort(arr);
        for(int i=left-1;i<right;i++){
            res=(res+arr[i])%mod;
        }
        return res;
    }
}