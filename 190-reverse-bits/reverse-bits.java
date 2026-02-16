class Solution {
    public int reverseBits(int n) {
        int num = n, k=1, res=0;
        String str = "";
        while(num>0){
            if((num&k)>0) {
                num-=k;
                str = str+"1";
            } else str = str+"0";
            k*=2;
        }
        k=8;
        int p=7, temp=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='1') temp+=k;
            k/=2;
            if(k==0 || str.length()-1==i){
                res += (temp*(int)Math.pow(16,p));
                p--; k=8; temp=0;
            }
        }
        return res;
    }
}