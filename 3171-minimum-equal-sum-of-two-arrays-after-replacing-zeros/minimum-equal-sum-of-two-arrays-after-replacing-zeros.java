class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        long sum1=0, sum2=0;
        int c1=0, c2=0;
        for(int i:nums1){
            if(i==0) c1++;
            else sum1+=i;
        }
        for(int i:nums2){
            if(i==0) c2++;
            else sum2+=i;
        }
        if(c1!=0 && c2!=0) return Math.max(sum1+c1,sum2+c2);
        if(c1==0 && c2==0) return sum1==sum2?sum1:-1;
        if(c1==0) return sum1>=sum2+c2?sum1:-1;
        return sum2>=sum1+c1?sum2:-1;
    }
}