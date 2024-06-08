class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        long sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int t=(int)(sum%k);
            if(map.containsKey(t)){
                if(i-map.get(t)>=2) return true;
            } else map.put(t,i);
        }
        return false;
    }
}