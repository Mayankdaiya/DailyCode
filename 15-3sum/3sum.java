class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            int p=i+1, q=n-1;
            while(p<q){
                long t=(long)nums[i]+nums[p]+nums[q];
                if(t<0){
                    p++;
                } else if(t>0){
                    q--;
                } else {
                    res.add(new ArrayList<>(Arrays.asList(nums[i],nums[p],nums[q])));
                    p++; q--;
                    while(p<q && nums[p]==nums[p-1]) p++;
                }
            }
        }
        return res;
    }
}