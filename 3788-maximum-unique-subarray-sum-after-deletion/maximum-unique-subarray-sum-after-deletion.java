class Solution {
    public int maxSum(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int sum=-101, f=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0){
                if(f==0) sum=0;
                f=1;
                if(!set.contains(nums[i])) sum+=nums[i];
                set.add(nums[i]);
            }
            if(f==0 && nums[i]>sum) sum=nums[i];
        }
        return sum;
    }
}