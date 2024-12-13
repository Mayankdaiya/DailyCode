class Solution {
    public long findScore(int[] nums) {
        int arr[][]=new int[nums.length][2];
        for(int i=0;i<nums.length;i++){
            arr[i][0]=nums[i];
            arr[i][1]=i;
        }
        Arrays.sort(arr,(int a[],int b[])->{
            if(a[0]!=b[0]) return a[0]-b[0];
            return a[1]-b[1];
        });
        long res=0;
        for(int i=0;i<nums.length;i++){
            int val=arr[i][0], idx=arr[i][1];
            if(nums[idx]!=-1){
                res+=val;
                if(idx-1>=0) nums[idx-1]=-1;
                if(idx+1<nums.length) nums[idx+1]=-1;
            }
        }
        return res;
    }
}