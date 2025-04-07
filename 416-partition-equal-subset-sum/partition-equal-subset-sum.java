class Solution {
    public boolean canPartition(int[] nums) {
        int total=0;
        for(int i:nums) total+=i;
        if(total%2!=0) return false;
        int sum=total/2;
        boolean pre[]=new boolean[sum+1];
        boolean curr[]=new boolean[sum+1];
        pre[0]=true;
        for(int i=1;i<=nums.length;i++){
            curr[0]=true;
            for(int j=1;j<=sum;j++){
                if(j<nums[i-1]) curr[j]=pre[j];
                else curr[j]=(pre[j] || pre[j-nums[i-1]]);
            }
            for(int ii=0;ii<=sum;ii++) pre[ii]=curr[ii];
        }
        return pre[sum];
    }
}