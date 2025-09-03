class Solution {
    public int minLengthAfterRemovals(List<Integer> nums) {
        int ans = nums.size(), len = ans, i=0, j=(len+1)/2;
        while(i<len/2 && j<len){
            if(nums.get(i)<nums.get(j)){
                ans-=2;
            }
            i++;
            j++;
        }
        return ans;
    }
}