class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int n=nums.length;
        int dif[]=new int[n+1];
        for(int i=0;i<n;i++){
            if(i==0) dif[i]=nums[i];
            else dif[i]=nums[i]-nums[i-1];
        }
        for(int i=0;i<queries.length;i++){
            dif[queries[i][0]]-=1;
            dif[queries[i][1]+1]+=1;
        }
        if(dif[0]>0) return false;
        for(int i=1;i<=n;i++){
            dif[i]+=dif[i-1];
            if(i!=n && dif[i]>0) return false;
        }
        return true;
    }
}


