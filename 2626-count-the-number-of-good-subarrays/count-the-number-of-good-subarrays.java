class Solution {
    public long countGood(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        int in=0, curr=0;
        long pairs=0;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(map.get(nums[i])>1) curr+=map.get(nums[i])-1;
            while(curr>=k){
                pairs+=(nums.length-i);
                if(map.get(nums[in])==1) map.remove(nums[in]);
                else {
                    curr-=(map.get(nums[in])-1);
                    map.put(nums[in],map.get(nums[in])-1);
                }
                in++;
            }
        } 
        return pairs;
    }
}
