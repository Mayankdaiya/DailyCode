class Solution {
    public int minimumDiameterAfterMerge(int[][] edges1, int[][] edges2) {
        List<List<Integer>> list1=buildTree(edges1);
        List<List<Integer>> list2=buildTree(edges2);
        int d1=findDiameter(list1);
        int d2=findDiameter(list2);
        int minDiam = (int)Math.ceil(d1/2.0)+(int)Math.ceil(d2/2.0)+1;
        return Math.max(Math.max(d1,d2),minDiam);
    }
    public static List<List<Integer>> buildTree(int edges[][]){
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<=edges.length;i++){
            list.add(new ArrayList<>());
        }
        for(int ed[]:edges){
            list.get(ed[0]).add(ed[1]);
            list.get(ed[1]).add(ed[0]);
        }
        return list;
    }
    public static int findDiameter(List<List<Integer>> list){
        Pair firstbfs = findFarthestNode(list,0);
        int farthestNode = firstbfs.first;
        Pair secondbfs = findFarthestNode(list,farthestNode);
        return secondbfs.second;
    }
    public static Pair findFarthestNode(List<List<Integer>> list,int src){
        Queue<Integer> q=new LinkedList<>();
        boolean vis[]=new boolean[list.size()];
        q.add(src);
        vis[src]=true;
        int mx=0, farnode=src;
        while(!q.isEmpty()){
            int s=q.size();
            while(s-->0){
                int curr=q.poll();
                farnode=curr;
                for(int neighbor:list.get(curr)){
                    if(!vis[neighbor]){
                        vis[neighbor]=true;
                        q.add(neighbor);
                    }
                }
            }
            if(!q.isEmpty()) mx++;
        }
        return new Pair(farnode,mx);
    }
    public static class Pair{
        int first, second;
        public Pair(int f,int s){
            first=f;
            second=s;
        }
    }
}