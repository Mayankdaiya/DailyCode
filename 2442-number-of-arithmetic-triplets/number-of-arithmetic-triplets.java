class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        int count=0;
        for(int i=0;i<nums.length-2;i++){
            int t=diff+nums[i];
            if(map.containsKey(t)){
                int in=map.get(t), k=diff+t;
                if(map.containsKey(k) && map.get(k)>in && in>i) count++;
            }
        }
        return count;
    }
}