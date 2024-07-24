class Solution {
    class pair{
        int num, val, in;
        pair(int num,int val,int in){
            this.num=num;
            this.val=val;
            this.in=in;
        }
    }
    public int[] sortJumbled(int[] mapping, int[] nums) {
        pair obj[]=new pair[nums.length];
        for(int i=0;i<nums.length;i++){
            int t=nums[i], val=0, p=1;
            if(t==0) val=mapping[0];
            while(t>0){
                val=p*(mapping[t%10])+val;
                t/=10; p*=10;
            }
            obj[i]=new pair(nums[i],val,i);
        }
        Arrays.sort(obj,(pair a,pair b) -> {
            return a.val-b.val;
        });
        for(int i=0;i<nums.length;i++){
            nums[i]=obj[i].num;
        }
        return nums;
    }
}