class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int res[]=new int[k];
        int arr[][]=new int[nums.length][2];
        for(int i=0;i<nums.length;i++){
            arr[i][0]=nums[i];
            arr[i][1]=i;
        }
        Arrays.sort(arr,(a,b)-> b[0]-a[0]);
        int arr2[][]=new int[k][2];
        for(int i=0;i<k;i++){
            arr2[i][0]=arr[i][0];
            arr2[i][1]=arr[i][1];
        }
        Arrays.sort(arr2,(a,b)->a[1]-b[1]);
        for(int i=0;i<k;i++){
            res[i]=arr2[i][0];
        }
        return res;
    }
}