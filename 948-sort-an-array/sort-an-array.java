class Solution {
    public void mergeSort(int[] nums, int si, int ei) {
        if(si >= ei) {
            return;
        }
        int mid = si + (ei-si)/2;
        mergeSort(nums, si, mid);
        mergeSort(nums, mid+1, ei);
        merge(nums, si, mid, ei);
    }
    public void merge(int[] nums, int si, int mid, int ei) {
        int arr[] = new int[ei-si+1];
        int i=si, j=mid+1, x=0;
        while(i <= mid && j <= ei) {
            if(nums[i] < nums[j]) {
                arr[x] = nums[i++];
            } else {
                arr[x] = nums[j++];
            }
            x++;
        }
        while(i <= mid) {
            arr[x++] = nums[i++];
        }
        while(j <= ei) {
            arr[x++] = nums[j++];
        }
        for(x=0, i=si; x<arr.length; x++, i++) {
            nums[i] = arr[x];
        }
    }
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length-1);
        return nums;
    }
}