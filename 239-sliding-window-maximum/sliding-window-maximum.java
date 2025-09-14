class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int res[] = new int[nums.length-k+1];
        ArrayDeque<Integer> q = new ArrayDeque<>();
        int in=0;
        for(int i=0;i<nums.length;i++){
            while(!q.isEmpty() && nums[q.getLast()]<nums[i]){
                q.removeLast();
            }
            q.addLast(i);
            if(q.getFirst()+k==i){
                q.removeFirst();    
            }
            if(i>=k-1){
                res[in++]=nums[q.getFirst()];
            }
        }
        return res;
    }
}