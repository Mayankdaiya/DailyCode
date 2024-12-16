class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        PriorityQueue<int[]> q=new PriorityQueue<>((int a[],int b[])->{
            if(a[0]!=b[0]) return a[0]-b[0];
            else return a[1]-b[1];
        });
        for(int i=0;i<nums.length;i++){
            q.add(new int[]{nums[i],i});
        }
        while(k-->0){
            int t[]=q.poll();
            q.add(new int[]{t[0]*multiplier,t[1]});
        }
        while(!q.isEmpty()){
            int t[]=q.poll();
            nums[t[1]]=t[0];
        }
        return nums;
    }
}