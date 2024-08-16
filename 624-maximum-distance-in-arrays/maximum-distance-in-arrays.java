class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int res=-1, min=arrays.get(0).get(0), max=arrays.get(0).get(arrays.get(0).size()-1);
        for(int i=1;i<arrays.size();i++){
            int t1=arrays.get(i).get(0), t2=arrays.get(i).get(arrays.get(i).size()-1);
            res=Math.max(res,Math.abs(max-t1));
            res=Math.max(res,Math.abs(t2-min));
            max=Math.max(max,t2);
            min=Math.min(min,t1);
        }
        return res;
    }
}