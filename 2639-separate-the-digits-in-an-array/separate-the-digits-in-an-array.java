class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            Stack<Integer> stk = new Stack<>();
            while(nums[i]>0){
                stk.push(nums[i]%10);
                nums[i]/=10;
            }
            while(!stk.isEmpty()){
                list.add(stk.pop());
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}