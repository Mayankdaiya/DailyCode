class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> q=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            q.add((long)nums[i]);
        }
        int op=0;
        while(q.size()>1){
            if(q.peek()>=k) break;
            long t=(long)q.poll()*2+q.poll();
            q.add(t);
            op++;
        }
        return op;
    }
}