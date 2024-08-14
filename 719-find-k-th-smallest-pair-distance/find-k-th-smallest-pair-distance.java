class Solution {
    public int smallestDistancePair(int[] nums, int k) {
        int arr[]=new int[1000001];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                arr[Math.abs(nums[j]-nums[i])]++;
            }
        }
        for(int i=0;i<arr.length;i++){
            while(arr[i]!=0){
                arr[i]--;
                k--;
            }
            if(k<=0) return i;
        }
        return -1;
    }
}