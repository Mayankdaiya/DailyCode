class Solution {
    public int minimumIndex(List<Integer> nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int el=nums.get(0);
        for(int i=0;i<nums.size();i++){
            map.put(nums.get(i),map.getOrDefault(nums.get(i),0)+1);
            if(map.get(nums.get(i))*2>nums.size()) el=nums.get(i);
        }
        int in=-1, c1=0, c2=map.get(el);
        for(int i=0;i<nums.size();i++){
            if(nums.get(i)==el){
                c1++;
            }
            if(c1*2>(i+1) && (c2-c1)*2>(nums.size()-i-1)){
                return i;
            }
        }
        return in;
    }
}