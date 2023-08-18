class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,List<Integer>> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
           if(map.containsKey(nums[i])){
               map.get(nums[i]).add(i);
           }else{
               map.put(nums[i],new ArrayList<Integer>());
               map.get(nums[i]).add(i);
           }
        } 
        for(int i=0;i<nums.length;i++){
            int t=target-nums[i];
            if(map.containsKey(t)){
                if(!map.get(t).contains(i)){
                    return new int[]{i,map.get(t).get(0)};
                } else{
                    if(map.get(t).size()>=2){
                        if(map.get(t).get(0)==i) return new int[]{i,map.get(t).get(1)};
                        else return new int[]{i,map.get(t).get(0)};
                    }
                }
            } 
        }
        return new int[2];
    }
}