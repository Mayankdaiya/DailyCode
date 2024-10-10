class Solution {
    public int maxWidthRamp(int[] nums) {
        List<Integer> list=new ArrayList<>();
        int len=0;
        for(int i=0;i<nums.length;i++){
            if(list.isEmpty()) list.add(i);
            else if(nums[list.get(list.size()-1)]>nums[i]) list.add(i);
            else {
                for(int j=list.size()-1;j>=0;j--){
                    if(nums[i]>=nums[list.get(j)]) len=Math.max(len,i-list.get(j));
                    else break;
                }
            }
        }
        return len;
    }
}