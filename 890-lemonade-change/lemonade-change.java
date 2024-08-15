class Solution {
    public boolean lemonadeChange(int[] bills) {
        int c1=0, c2=0;
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5) c1++;
            else if(bills[i]==10){
                if(c1>0) c1--;
                else return false; 
                c2++;
            } else {
                if(c1==0) return false;
                if(c2>0){
                    c2--;
                    c1--;
                } else if(c1>2) c1-=3;
                else return false;
            }
        }
        return true;
    }
}