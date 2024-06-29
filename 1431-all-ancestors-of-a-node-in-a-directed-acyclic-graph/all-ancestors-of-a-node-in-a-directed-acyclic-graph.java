class Solution {
    public List<List<Integer>> getAncestors(int n, int[][] edges) {
        List<List<Integer>> anc=new ArrayList<>();
        for(int i=0;i<n;i++) anc.add(new ArrayList<>());
        for(int[] edge: edges) anc.get(edge[1]).add(edge[0]);
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<n;i++){
            boolean vis[]=new boolean[n];
            List<Integer> list=new ArrayList<>();
            dfs(i,list,vis,anc);
            Collections.sort(list);
            res.add(list);
        }
        return res;
    }
    public static void dfs(int el, List<Integer> list, boolean vis[],List<List<Integer>> anc){
        for(int i=0;i<anc.get(el).size();i++){
            int t=anc.get(el).get(i);
            if(!vis[t]){
                list.add(t);
                vis[t]=true;
                dfs(t,list,vis,anc);
            }
        }
    }
}