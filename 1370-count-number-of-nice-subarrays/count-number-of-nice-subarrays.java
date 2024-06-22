class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int st=0, in=-1, en=-1, c=0, res=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==1){
                if(in==-1) in=i;
                c++;
                if(c==k) en=i; 
            }
            if(c==k+1){
                int t1=in-st+1, t2=i-en;
                res+=t1*t2;
                st=in+1; en=i; c--;
                while(in<nums.length && nums[++in]%2==0){}
            }
        }
        if(in!=-1 && en!=-1){
            int t1=in-st+1, t2=nums.length-en;
            res+=t1*t2;
        }
        return res;
    }
}