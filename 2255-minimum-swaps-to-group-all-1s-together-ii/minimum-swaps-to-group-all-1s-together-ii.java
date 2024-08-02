class Solution {
    public int minSwaps(int[] nums) {
        int count = 0;
        for(int el: nums){
            if (el==1) count++;
        }
        int max1= 0;
        int si= 0;
        int ei= si + count;
        int ic= 0;
        for (int i=si;i<ei;i++){
            if (nums[i%nums.length]==1) ic++;
        }
        ei--;
        while (si<nums.length) {
            if(nums[si%nums.length]==0 && nums[(ei+1)%nums.length]==1){
                ic++;
            } else if(nums[si%nums.length]==1 && nums[(ei+1)%nums.length]==0){
                ic--;
            }
            if(ic>max1)max1= ic;
            si++;
            ei++;
        }
        
        return count-max1;
    }
}