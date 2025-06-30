class Solution {
    public int findLHS(int[] nums) {
        Map<Integer,Integer> map=new TreeMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }   
        int res=0, in=0, f=0;
        for(int key:map.keySet()){
            if(f==0){
                in=key;
                f=1;
            } else {
                if(key-in<=1){
                    res=Math.max(res,map.get(in)+map.get(key));
                } 
                in=key;
            }
        }
        return res;
    }
}