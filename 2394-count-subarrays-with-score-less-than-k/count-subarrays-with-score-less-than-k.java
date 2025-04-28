class Solution {
    public long countSubarrays(int[] num, long k) {
        long nums[]=new long[num.length];
        nums[0]=num[0];
        for(int i=1;i<nums.length;i++){
            nums[i]=num[i]+nums[i-1];
        }
        long res=0;
        for(int i=0;i<nums.length;i++){
            int in=getidx(nums,i,k);
            if(in!=-1) res+=((long)in-i+1);
        }
        return res;
    }

    public int getidx(long[] nums,int i,long k){
        int j=nums.length-1, in=i-1, ans=-1;
        long st=0;
        if(i!=0) st=nums[i-1];
        while(i<=j){
            int mid=i+(j-i)/2;
            long val=((long)nums[mid]-st)*(mid-in);
            if(val>=k) j=mid-1;
            else{
                ans=mid;
                i=mid+1;
            }
        }
        return ans;
    }
}