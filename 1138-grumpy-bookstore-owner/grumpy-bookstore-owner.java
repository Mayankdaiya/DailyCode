class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int cus=0;
        for(int i=0;i<customers.length;i++){
            if(grumpy[i]==0) cus+=customers[i];
        }
        int Maxc=0;
        for(int i=0;i<minutes && i<grumpy.length;i++){
            if(grumpy[i]==1) Maxc+=customers[i];
        }
        int c=Maxc;
        for(int i=minutes;i<grumpy.length;i++){
            if(grumpy[i-minutes]==1) c-=customers[i-minutes];
            if(grumpy[i]==1) c+=customers[i];
            if(c>Maxc) Maxc=c; 
        }
        return Maxc+cus;
    }
}