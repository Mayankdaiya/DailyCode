class Solution {
    public int minGroups(int[][] intervals) {
        int n=intervals.length;
        TreeMap<Integer,Integer> map=new TreeMap<>();
        for(int i=0;i<n;i++){
            map.put(intervals[i][0],map.getOrDefault(intervals[i][0],0)+1);
            map.put(intervals[i][1]+1,map.getOrDefault(intervals[i][1]+1,0)-1);
        }
        int size=0, res=0;
        for(int key:map.keySet()){
            size+=map.get(key);
            res=Math.max(res,size);
        }
        return res==0?1:res;
    }
}