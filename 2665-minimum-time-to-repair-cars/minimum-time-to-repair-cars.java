class Solution {
    public long repairCars(int[] ranks, int cars) {
        long i=1, j=Long.MAX_VALUE;
        while(i<j){
            long mid=i+(j-i)/2;
            if(check(ranks,mid,cars)){
                j=mid;
            } else i=mid+1;
        }
        return i;
    }
    public static boolean check(int ranks[],long val,int cars){
        for(int i=0;i<ranks.length && cars>0;i++){
            int n=(int)Math.pow((double)(val/ranks[i]),(double)1/2);
            cars-=n;
        }
        return cars<=0;
    }
}