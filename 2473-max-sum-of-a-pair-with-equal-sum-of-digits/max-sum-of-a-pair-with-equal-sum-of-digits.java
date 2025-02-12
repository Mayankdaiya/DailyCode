class Solution {
    public int maximumSum(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        int res=0;
        for(int i=0;i<nums.length;i++){
            int t=getsum(nums[i]);
            if(map.containsKey(t)){
                res=Math.max(res,nums[i]+map.get(t));
                if(map.get(t)<nums[i]) map.put(t,nums[i]);
            } else{
                map.put(t,nums[i]);
            }
        }
        return res==0?-1:res;
    }
    public static int getsum(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
}