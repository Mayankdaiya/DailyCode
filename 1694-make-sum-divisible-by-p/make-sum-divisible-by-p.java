class Solution {
    public int minSubarray(int[] nums, int p) {
        long sum=nums[0];
        nums[0]%=p;
        for(int i=1;i<nums.length;i++){
            sum=(sum+nums[i])%p;
            nums[i]=(nums[i]+nums[i-1])%p;
        }
        if(sum%p==0) return 0;
        Map<Integer,Integer> map=new HashMap<>();
        int len=nums.length;
        long temp=sum;
        for(int i=0;i<nums.length;i++){
            temp-=nums[i];
            if(temp==0) len=Math.min(len,i+1);
            if(map.containsKey(0)) len=Math.min(len,nums.length-map.get(0));
            int t=(int)(p-temp)%p;
            if(map.containsKey(t)) len=Math.min(len,i-map.get(t));
            map.put(nums[i],i); temp=sum;
        }
        if(len==nums.length) return -1;
        return len;
    }
}