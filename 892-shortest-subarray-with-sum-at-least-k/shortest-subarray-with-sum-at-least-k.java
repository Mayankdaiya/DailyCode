class Solution {
    public int shortestSubarray(int[] arr, int k) {
        long nums[]=new long[arr.length];
        nums[0]=arr[0];
        for(int i=1;i<nums.length;i++){
            nums[i]+=nums[i-1]+arr[i];
        }
        int res=Integer.MAX_VALUE;
        Deque<Integer> dq=new ArrayDeque<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=k) res=Math.min(res,i+1);
            while(!dq.isEmpty() && nums[i]-nums[dq.peekFirst()]>=k){
                res=Math.min(res,i-dq.pollFirst());
            }
            while(!dq.isEmpty() && nums[i]<=nums[dq.peekLast()]){
                dq.pollLast();
            }
            dq.addLast(i);
        }
        return res==Integer.MAX_VALUE?-1:res;
    }
}