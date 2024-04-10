class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        int n=deck.length;
        int res[]=new int[n];
        Deque<Integer> q=new LinkedList<>();
        for(int i=0;i<n;i++) q.add(i);
        for(int i:deck){
            int idx=q.poll();
            res[idx]=i;
            if(!q.isEmpty()){
                q.add(q.poll());
            }
        }
        return res;
    }
}