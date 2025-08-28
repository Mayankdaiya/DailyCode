class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n=grid.length, m=grid[0].length;
        // lower triangle
        for(int i=0;i<n-1;i++){
            PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
            int j=i, k=0;
            while(j<n && k<m){
                pq.add(grid[j][k]);
                j++; k++;
            }
            j=i; k=0;
            while(!pq.isEmpty()){
                grid[j][k]=pq.poll();
                j++; k++;
            }
        }
        for(int i=1;i<m-1;i++){
            PriorityQueue<Integer> pq=new PriorityQueue<>();
            int j=0, k=i;
            while(j<n && k<m){
                pq.add(grid[j][k]);
                j++; k++;
            }
            j=0; k=i;
            while(!pq.isEmpty()){
                grid[j][k]=pq.poll();
                j++; k++;
            }
        }
        return grid;
    }
}