class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        Map<Integer,List<Integer>> map=new HashMap<>();
        for(int i=0;i<edges.length;i++){
            if(!map.containsKey(edges[i][0])) map.put(edges[i][0],new ArrayList<>());
            if(!map.containsKey(edges[i][1])) map.put(edges[i][1],new ArrayList<>());
            map.get(edges[i][0]).add(edges[i][1]);
            map.get(edges[i][1]).add(edges[i][0]);
        }
        Queue<Integer> q=new LinkedList<>();
        boolean vis[]=new boolean[n];
        q.add(source);
        while(!q.isEmpty()){
            int ed=q.poll();
            if(ed==destination) return true;
            if(vis[ed] || !map.containsKey(ed)) continue;
            vis[ed]=true;
            for(int t:map.get(ed)){
                q.add(t);
            }
        }
        return false;
    }
}