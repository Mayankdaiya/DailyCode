class Solution {
    public class Pair{
        int val, idx;
        Pair(int val,int idx){
            this.val=val;
            this.idx=idx;
        }
    }
    public long findScore(int[] nums) {
        PriorityQueue<Pair> q=new PriorityQueue<>((a,b)->{
            if(a.val!=b.val) return a.val-b.val;
            return a.idx-b.idx;
        });
        int n=nums.length;
        for(int i=0;i<n;i++){
            q.add(new Pair(nums[i],i));
        }
        long res=0;
        Set<Integer> set=new HashSet<>();
        while(!q.isEmpty()){
            Pair t=q.poll();
            if(!set.contains(t.idx)){
                res+=t.val;
                if(t.idx-1>=0) set.add(t.idx-1);
                if(t.idx+1<n) set.add(t.idx+1);
            }
        }
        return res;
    }
}