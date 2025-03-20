class Solution {
    int parent[];
    int depth[];
    public int[] minimumCost(int n, int[][] edges, int[][] queries) {
        int cost[]=new int[n];
        parent=new int[n];
        depth=new int[n];
        for(int i=0;i<n;i++) parent[i]=-1;
        for(int i=0;i<n;i++) cost[i]=Integer.MAX_VALUE;

        for(int edge[]:edges){
            union(edge[0],edge[1]);
        }
        for(int edge[]:edges){
            int root=find(edge[0]);
            cost[root]&=edge[2];
        }
        int ans[]=new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int st=queries[i][0];
            int en=queries[i][1];
            if(find(st)!=find(en)){
                ans[i]=-1;
            } else {
                int r=find(st);
                ans[i]=cost[r];
            }
        }
        return ans;
    }
    private void union(int n1, int n2){
        int r1=find(n1);
        int r2=find(n2);
        if(r1==r2) return;
        if(depth[r1]<depth[r2]){
            int t=r1;
            r1=r2;
            r2=t;
        }
        parent[r2]=r1;
        if(depth[r1]==depth[r2]){
            depth[r1]++;
        }
    }
    private int find(int n){
        if(parent[n]==-1) return n;
        return parent[n]=find(parent[n]);
    }
}