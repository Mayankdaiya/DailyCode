class Solution {
    public int maximumCount(int[] nums) {
        int pos=0, neg=0;
        for(int el:nums){
            if(el<0) neg++;
            else if(el>0) pos++;
        }
        return Math.max(pos,neg);
    }
}