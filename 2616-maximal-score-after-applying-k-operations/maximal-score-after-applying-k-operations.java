class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> q=new PriorityQueue<>((a, b)-> b-a);
        for(int i=0;i<nums.length;i++) q.add(nums[i]);
        long res=0;
        while(k>0){
            int t=q.poll();
            res+=t;
            q.add((int)Math.ceil((double)t/3));
            k--;
        }
        return res;
    }
}