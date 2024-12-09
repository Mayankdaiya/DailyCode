class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int n=nums.length, m=queries.length;
        int arr[]=new int[n];
        arr[0]=1;
        for(int i=1;i<n;i++){
            int t=(nums[i]+nums[i-1])%2;  
            if(t==1) arr[i]+=arr[i-1]+1;
            else arr[i]=1;
        }
        boolean[] ans=new boolean[m];
        for(int i=0;i<m;i++){
            int t1=queries[i][0], t2=queries[i][1];
            ans[i]=(t2-t1==arr[t2]-arr[t1]);
        }
        return ans;
    }
}