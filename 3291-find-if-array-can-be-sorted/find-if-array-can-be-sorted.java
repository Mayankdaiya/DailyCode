class Solution {
    public boolean canSortArray(int[] nums) {
        if(nums.length==1) return true;
        int i=0, j=nums.length-1, c=0;
        while(i<j){
            if(nums[i]>nums[i+1]){
                c=0;
                if(Integer.bitCount(nums[i])==Integer.bitCount(nums[i+1])){
                    int t=nums[i];
                    nums[i]=nums[i+1];
                    nums[i+1]=t;
                } else return false;
            } else c++;
            if(c==j) return true;
            i++;
            if(i==j) i=0;
        }
        return false;
    }
}