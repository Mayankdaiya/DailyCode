class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> list=new ArrayList<>();
        return getsubset(nums,0,list);
    }
    public static List<List<Integer>> getsubset(int nums[],int in,List<Integer> list){
        if(in==nums.length){
            List<List<Integer>> l=new ArrayList<>();
            l.add(new ArrayList<>(list));
            return l;
        }
        List<List<Integer>> l=new ArrayList<>();
        list.add(nums[in]);
        l.addAll(getsubset(nums,in+1,list));
        list.remove(list.size()-1);
        l.addAll(getsubset(nums,in+1,list));
        return l;
    } 
}