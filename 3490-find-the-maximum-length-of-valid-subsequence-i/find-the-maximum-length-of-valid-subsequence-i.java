class Solution {
    public int maximumLength(int[] nums) {
        int ev=0, od=0, f1=0, f2=0, ae=0, ao=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                ev++;
                if(f1==0){
                    f1=1; ae++;
                }
                if(f2==1){
                    f2=0; ao++;
                }
            } 
            else {
                od++;
                if(f1==1){
                    f1=0; ae++;
                }
                if(f2==0){
                    f2=1; ao++;
                }
            } 
        }
        return Math.max(Math.max(ev,od),Math.max(ae,ao));
    }
}
