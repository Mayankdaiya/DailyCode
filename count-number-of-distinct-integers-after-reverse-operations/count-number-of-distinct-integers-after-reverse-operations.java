class Solution {
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
            set.add(reverse(nums[i]));
        }
        return set.size();
    }
    public static int reverse(int n){
        int t=0;
        while(n>0){
            t=t*10+n%10;
            n/=10;
        }
        return t;
    }
}