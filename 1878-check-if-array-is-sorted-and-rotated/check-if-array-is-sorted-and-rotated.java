class Solution {
    public boolean check(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            int in=i+1, len=in+n-1, f=0;
            while(in<len){
                if(nums[in%n]<nums[(in-1)%n]){
                    f=1;
                    break;
                }
                in++;
            }
            if(f==0) return true;
        }
        return false;
    }
}