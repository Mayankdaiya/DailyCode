class Solution {
    public int minKBitFlips(int[] nums, int k) {
        int f=0, c=0, flag=0, res=0;
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<nums.length;i++){
            nums[i]=Math.abs(f-nums[i]);
            if(nums[i]==0){
                f=Math.abs(f-1); nums[i]=1;
                flag=1; q.add(c+k); c++; res++;
            } else if(flag==1) c++;
            if(!q.isEmpty() && q.peek()==c){
                q.remove();
                f=Math.abs(f-1);
                if(q.isEmpty()) flag=0;
            }
        }
        if(!q.isEmpty()) return -1;
        return res;
    }
}