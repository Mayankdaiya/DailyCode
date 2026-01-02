class Solution {
    public int repeatedNTimes(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int el:nums){
            if(set.contains(el)) return el;
            set.add(el);
        }
        return -1;
    }
}