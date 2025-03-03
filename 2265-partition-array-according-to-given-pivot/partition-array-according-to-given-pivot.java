class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> l1=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot) l1.add(nums[i]);
            else if(nums[i]>pivot) l2.add(nums[i]);
            else c++;
        }
        int in=0;
        for(int el:l1) nums[in++]=el;
        while(c-->0){ 
            nums[in++]=pivot;
        }
        for(int el:l2) nums[in++]=el;
        return nums; 
    }
}