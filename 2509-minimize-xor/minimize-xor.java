class Solution {
    public int minimizeXor(int num1, int num2) {
        int n1=countBits(num1);
        int n2=countBits(num2);
        if(n1==n2) return num1;
        else if(n2>n1){
            int t=n2-n1, bit=1;
            while(t>0){
                if((bit&num1)==0){
                    num1+=bit;
                    t--;
                }
                bit*=2;
            }
            return num1;
        } else {
            int t=n1-n2, bit=1;
            while(t>0){
                if((bit&num1)>0){
                    num1-=bit;
                    t--;
                } 
                bit*=2;
            }
            return num1;
        }

    }
    public int countBits(int n){
        int setBits=0, bit=1;
        while(n>0){
            if((n&bit)>0){
                n-=bit;
                setBits++;
            } 
            bit*=2;
        }
        return setBits;
    }
}