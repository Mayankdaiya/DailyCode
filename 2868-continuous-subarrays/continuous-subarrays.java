class Solution {
    public long continuousSubarrays(int[] nums) {
        TreeMap<Integer,Integer> map=new TreeMap<>();
        long res=0;
        int l=0, r=0, n=nums.length;
        while(r<n){
            map.put(nums[r],map.getOrDefault(nums[r],0)+1);
            while(map.lastEntry().getKey()-map.firstEntry().getKey()>2){
                map.put(nums[l],map.get(nums[l])-1);
                if(map.get(nums[l])==0) map.remove(nums[l]);
                l++;
            }
            res+=r-l+1;
            r++;
        }
        return res;
    }
}