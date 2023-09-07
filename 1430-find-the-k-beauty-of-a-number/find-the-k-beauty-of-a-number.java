class Solution {
    public int divisorSubstrings(int num, int k) {
        int len=(int)Math.log10(num)+2, mod=(int)Math.pow(10,k), count=0;
        int p=len-k;
        while(p-->0){
            int div=(int)Math.pow(10,p);
            int t=(num/div)%mod;
            if(t!=0 && num%t==0) count++;
        }
        return count;
    }
}