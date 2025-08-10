class Solution {
    public boolean reorderedPowerOf2(int n) {
        int frq[] = new int[10];
        int len = 0, t = n;
        while(n>0){
            frq[n%10]++;
            n/=10;
            len++;
        }
        int num = 1;
        while(num>0){
            if(num==t) return true;
            int l = (int)Math.log10(num)+1;
            if(len==l){
                int f[] = new int[10];
                int tmp = num;
                while(tmp>0){
                    f[tmp%10]++;
                    tmp/=10;
                }
                for(int i=0;i<10;i++){
                    if(f[i]!=frq[i]) tmp = -1;
                }
                if(tmp!=-1) return true;
            } else if(l>len){
                return false;
            }
            num*=2;
        }
        return false;
    }
}