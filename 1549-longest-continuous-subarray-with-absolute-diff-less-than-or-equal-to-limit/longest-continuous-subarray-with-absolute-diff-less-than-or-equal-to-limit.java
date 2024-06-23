class Solution {
    public int longestSubarray(int[] nums, int limit) {
        LinkedList<Integer> inc = new LinkedList<>();
        LinkedList<Integer> dec = new LinkedList<>();
        int l= 0, res= 0;
        for(int i=0;i<nums.length;i++){
            int el=nums[i];
            while(inc.size()>0 && el<inc.getLast()) inc.removeLast();
            inc.add(el);
            while(dec.size()>0 && el>dec.getLast()) dec.removeLast();
            dec.add(el);
            while(dec.getFirst() - inc.getFirst() > limit){
                if(nums[l] == inc.getFirst()){
                    inc.removeFirst();
                }
                if(nums[l] == dec .getFirst()){
                    dec.removeFirst();
                }
                l++;
            }
            int size= i-l+1;
            res= Math.max(res,size);
        }
        return res;
    }
}