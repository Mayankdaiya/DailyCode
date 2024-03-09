class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int i=0, j=0, min=-1;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                i++;
            }
            else if(nums2[j]<nums1[i]){
                j++;
            }
            else{
                min=nums1[i];
                break;
            }
        }
        return min;
    }
}