class Solution {
    public int minOperations(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        } 
        int op=0;
        for(int key:map.keySet()){
            int t=map.get(key);
            if(t==1) return -1;
            else if(t%3==0) op+=t/3;
            else op+=(t/3) + 1;
        }
        return op;
    }
}