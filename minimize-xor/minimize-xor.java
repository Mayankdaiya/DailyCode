class Solution {
    public int minimizeXor(int num1, int num2) {
        int bit=SetBit(num2);
        int ans=0;
        for(int i=31;i>=0 && bit>0;i--){
            if((num1&(1<<i))!=0){
                ans+=(1<<i);
                bit--;
            }
        }
        for(int i=0;i<=31 && bit>0;i++){
            if((num1&(1<<i))==0){
                ans+=(1<<i);
                bit--;
            }
        }
        return ans;
    }
    public static int SetBit(int n){
        int count=0;
        while(n>0){
            count++;
            n=n&(n-1);
        }
        return count;
    }
}