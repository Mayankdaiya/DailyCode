class Solution {
    public int minimumOperations(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int op=0;
        for(int i=nums.length-1;i>=0;i--){
            if(set.contains(nums[i])){
                int t=(i+1)/3;
                op+=t;
                if(t*3<(i+1)) op++;
                break;
            } else set.add(nums[i]);
        }
        return op;
    }
}