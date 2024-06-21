class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int res=0, z=0, mx=0, i=0, n=customers.length;
        while(i<minutes){
            if(grumpy[i]==0) res+=customers[i];
            else mx+=customers[i];
            i++;
        }
        z=mx;
        for(i=minutes;i<n;i++){
            if(grumpy[i]==0) res+=customers[i];
            else z+=customers[i];
            if(grumpy[i-minutes]==1) z-=customers[i-minutes];
            if(z>mx) mx=z; 
        }
        return res+mx;
    }
}