class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> set = new HashMap<>();
        int res = 0;
        for(int i=0;i<nums.length;i++){
            if(i!=0) nums[i]+=nums[i-1];
            if(nums[i]==k) res++;
            if(set.containsKey(nums[i]-k)) res+=set.get(nums[i]-k);
            set.put(nums[i],set.getOrDefault(nums[i],0)+1);
        }    
        return res;
    }
}