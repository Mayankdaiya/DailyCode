class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        long res=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]+nums[nums.length-1]<lower || nums[i]+nums[i+1]>upper) continue;
            int in=i+1, j=nums.length-1, l=-1, u=-1;
            while(in<j){
                int mid=in+(j-in)/2, sum=nums[i]+nums[mid];
                if(sum<=upper) in=mid+1;
                else if(sum>upper) j=mid-1;
            }
            if(u==-1) u=j;
            while(u>=0 && nums[i]+nums[u]>upper) u--;
            in=i+1; j=nums.length-1;
            while(in<j){
                int mid=in+(j-in)/2, sum=nums[i]+nums[mid];
                if(sum>=lower) j=mid-1;
                else if(sum<lower) in=mid+1;
            }
            if(l==-1) l=in;
            while(l<nums.length && nums[i]+nums[l]<lower) l++;
            // System.out.println(l+"-"+u);
            res+=(u-l+1);
        }
        return res;
    }
}