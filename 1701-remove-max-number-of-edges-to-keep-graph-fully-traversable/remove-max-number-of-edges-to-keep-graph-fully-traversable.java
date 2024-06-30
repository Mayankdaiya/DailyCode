class Solution {
    public int maxNumEdgesToRemove(int n, int[][] edges) {
        DSU alice=new DSU(n);
        DSU bob=new DSU(n);
        int minEdge=0;
        for(int edge[]:edges){
            if(edge[0]==3){
                minEdge+=(alice.Union(edge[1],edge[2]) | bob.Union(edge[1],edge[2]));
            }
        }
        for(int edge[]:edges){
            if(edge[0]==1){
                minEdge+=alice.Union(edge[1],edge[2]);
            } else if(edge[0]==2){
                minEdge+=bob.Union(edge[1],edge[2]);
            }
        }
        if(alice.isConnected() && bob.isConnected()){
            return edges.length-minEdge;
        }
        return -1;
    }
    class DSU{
        int[] parent;
        int[] rank;
        int comp;

        DSU(int n){
            comp=n;
            parent=new int[n+1];
            rank=new int[n+1];
            for(int i=0;i<=n;i++){
                parent[i]=i;
                rank[i]=1;
            }    
        }
        int find(int x){
            if(parent[x]==x) return x;
            return parent[x]=find(parent[x]);
        }
        int Union(int x, int y){
            x=find(x);
            y=find(y);
            if(x==y){
                return 0;
            }
            if(rank[x]>rank[y]){
                rank[x]+=rank[y];
                parent[y]=x;
            } else {
                rank[y]+=rank[x];
                parent[x]=y;
            }
            comp--;
            return 1;
        }
        boolean isConnected(){
            return comp==1;
        }
    }
}