class Solution {
    public int minCapability(int[] nums, int k) {
        int i=nums[0], j=0;
        for(int in=0;in<nums.length;in++){
            i=Math.min(nums[in],i);
            j=Math.max(nums[in],j);
        }
        while(i<j){
            int mid=i+(j-i)/2;
            if(possible(nums,mid,k)){
                j=mid;
            } else i=mid+1;
        }
        return i;
    }   
    public static boolean possible(int nums[],int val,int k){
        int i=0, c=0;
        while(i<nums.length && c<k){
            if(nums[i]<=val){
                c++; i++;
            }
            i++;
        }
        return c==k;
    }
}