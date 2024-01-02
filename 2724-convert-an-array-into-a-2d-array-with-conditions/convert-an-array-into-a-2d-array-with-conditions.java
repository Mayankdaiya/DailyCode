class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list=new ArrayList<>();
        list.add(new ArrayList<>(Arrays.asList(nums[0])));
        int c=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                c++;
                if(list.size()>c){
                    list.get(c).add(nums[i]);
                } else{
                    list.add(new ArrayList<>(Arrays.asList(nums[i])));
                } 
            } else{
                c=0;
                list.get(c).add(nums[i]);
            }
        }    
        return list;
    }
}