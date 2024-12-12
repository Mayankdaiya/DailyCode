class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> q=new PriorityQueue<>((a,b)->b-a);
        for(int i=0;i<gifts.length;i++){
            q.add(gifts[i]);
        }
        while(k-->0){
            int t=(int)Math.pow(q.poll(),(double)1/2);
            q.add(t);
        }
        long res=0;
        while(!q.isEmpty()){
            res+=q.poll();
        }
        return res;
    }
}