class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        int s=0;
        for(int i=0;i<piles.length;i++){ 
            pq.add(piles[i]); s+=piles[i];
        }
        while(k-->0){
            int t=pq.poll();
            if(t%2==1){ 
                t++; s++;
            }
            s-=t/2; pq.add(t/2);
        }
        return s;
    }
}