class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        list.add(1);
        ans.add(new ArrayList<>(list)); list.clear();
        while(numRows-->1){
            list.add(1);
            for(int i=1;i<ans.get(ans.size()-1).size();i++){
                list.add(ans.get(ans.size()-1).get(i)+ans.get(ans.size()-1).get(i-1));
            }
            list.add(1);
            ans.add(new ArrayList<>(list)); 
            list.clear();
        }
        return ans;
    }
}