class Solution {
    public class Pair{
        int t, x, y;
        Pair(int t,int x,int y){
            this.t=t;
            this.x=x;
            this.y=y;
        }
    }

    public int minTimeToReach(int[][] mt) {
        int n=mt.length, m=mt[0].length;
        int min[][]=new int[n][m];
        int arr[][]={{1,0},{0,1},{-1,0},{0,-1}};
        for(int t[]:min){
            Arrays.fill(t,Integer.MAX_VALUE);
        }
        PriorityQueue<Pair> q=new PriorityQueue<>((a,b)->a.t-b.t);
        q.add(new Pair(-1,0,0));
        mt[0][0]=0;
        while(!q.isEmpty()){
            Pair tmp=q.poll();
            int move=tmp.t, i=tmp.x, j=tmp.y;
            if(move>=min[i][j]) continue;
            if(i==n-1 && j==m-1) return move;
            min[i][j]=move;
            for(int k=0;k<4;k++){
                int a=i+arr[k][0], b=j+arr[k][1];
                if(a>=0 && b>=0 && a<n && b<m && min[a][b]==Integer.MAX_VALUE){
                    int cur=Math.max(mt[a][b],move)+1;
                    q.add(new Pair(cur,a,b));
                }
            }
        }
        return -1;
    }
}