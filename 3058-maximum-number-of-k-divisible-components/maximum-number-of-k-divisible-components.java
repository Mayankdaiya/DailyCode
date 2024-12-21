class Solution {
    public int maxKDivisibleComponents(int n, int[][] edges, int[] values, int k) {
        List<Integer>[] list=new ArrayList[n];
        for(int i=0;i<n;i++){
            list[i]=new ArrayList<>();
        }
        for(int ed[]:edges){
            list[ed[0]].add(ed[1]);
            list[ed[1]].add(ed[0]);
        }
        int res[]=new int[1];
        dfs(0,-1,list,values,k,res);
        return res[0];
    }
    public static int dfs(int cur,int parent,List<Integer>[] list,int values[],int k, int res[]){
        int sum=0;
        for(int node:list[cur]){
            if(node!=parent){
                sum+=dfs(node,cur,list,values,k,res);
                sum%=k;
            }
        }
        sum+=values[cur];
        sum%=k;
        if(sum==0){
            res[0]++;
        }
        return sum;
    }
}