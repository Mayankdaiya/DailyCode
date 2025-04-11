class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int res=0;
        for(int i=low;i<=high;i++){
            res+=get(i);
        }
        return res;
    }
    public int get(int val){
        int len=(int)Math.log10(val)+1;
        if(len%2==1) return 0;
        int l=0, r=0, s=0;
        while(val>0){
            if(s<len/2) r+=(val%10);
            else l+=(val%10);
            s++;
            val/=10;
        }
        return l==r?1:0;
    }
}