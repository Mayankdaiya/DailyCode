class Solution {
    public int mostBooked(int n, int[][] meetings) {
        Arrays.sort(meetings,(a,b)->a[0]-b[0]);
        PriorityQueue<long[]> q=new PriorityQueue<>((a,b)->Long.compare(a[0],b[0])!=0?Long.compare(a[0],b[0]):Long.compare(a[1],b[1]));
        PriorityQueue<Integer> room=new PriorityQueue<>();  
        int count[]=new int[n];
        for(int i=0;i<n;i++) room.offer(i);
        for(int[] met:meetings){
            int st=met[0], en=met[1];
            while(!q.isEmpty() && q.peek()[0]<=st){
                room.offer((int)q.poll()[1]);
            }
            if(!room.isEmpty()){
                int rm=room.poll();
                q.offer(new long[]{en,rm});
                count[rm]++;
            } else {
                long t=q.peek()[0]+(en-st);
                q.offer(new long[]{t,q.peek()[1]});
                count[(int)q.poll()[1]]++;
            }
        }
        int res=0, max=0;
        for(int i=0;i<n;i++){
            if(count[i]>max){
                max=count[i];
                res=i;
            }
        }
        return res;
    }
}