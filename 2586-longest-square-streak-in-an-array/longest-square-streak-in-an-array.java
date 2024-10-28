class Solution {
    public int longestSquareStreak(int[] nums) {
        Arrays.sort(nums);
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i])) continue;
            int t=nums[i]*nums[i], f=0;
            while(set.contains(t)){
                set.remove(t);
                f++; t*=t;
            }
            set.remove(nums[i]);
            map.put(nums[i],f);
            max=Math.max(max,f);
        } 
        return (max==0?-2:max)+1;
    }
}