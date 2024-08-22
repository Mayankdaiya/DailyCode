class Solution {
    public int findComplement(int num) {
        int res=0, p=1;
        while(num>0){
            if((num&p)==p) num-=p;
            else res+=p;
            p*=2; 
        }
        return res;
    }
}