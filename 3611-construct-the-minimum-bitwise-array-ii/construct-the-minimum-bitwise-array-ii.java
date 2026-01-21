class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int ans[] = new int[nums.size()];
        for(int i=0;i<nums.size();i++){
            int res=-1, d=1, el=nums.get(i);
            while((el&d)!=0){
                res=(el-d);
                d<<=1;
            }
            ans[i]=res;
        }
        return ans;
    }
}