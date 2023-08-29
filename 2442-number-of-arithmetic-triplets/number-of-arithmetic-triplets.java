class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=2;i<nums.length;i++){
            map.put(nums[i],i);
        }
        int count=0;
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                if(nums[j]-nums[i]==diff && map.containsKey(diff+nums[j])){
                    if(map.get(diff+nums[j])>j) count++;
                }
            }
        }
        return count;
    }
}