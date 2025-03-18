class Solution {
    public int longestNiceSubarray(int[] nums) {
        int in=0, res=1;
        int bit[]=new int[33];
        for(int i=0;i<nums.length;i++){
            change(bit,nums[i],1);
            while(in<i && !isbitone(bit)){
                change(bit,nums[in],-1);
                in++;
            }
            res=Math.max(res,i-in+1);
        }
        return res;
    }
    public static void change(int bit[], int val, int op){
        int p=1, in=1;
        while(val>0){
            if((val&p)!=0){
                bit[in]+=op;
                val-=p;
            }
            in++; p*=2;
        }
    }
    public static boolean isbitone(int bit[]){
        for(int i=1;i<33;i++){
            if(bit[i]>1) return false;
        }
        return true;
    }
}