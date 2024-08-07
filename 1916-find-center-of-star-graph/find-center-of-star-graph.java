class Solution {
    public int findCenter(int[][] edges) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<edges.length;i++){
            map.put(edges[i][0],map.getOrDefault(edges[i][0],0)+1);
            map.put(edges[i][1],map.getOrDefault(edges[i][1],0)+1);
            if(map.get(edges[i][0])==edges.length) return edges[i][0];
            if(map.get(edges[i][1])==edges.length) return edges[i][1];
        }
        return -1;
    }
}