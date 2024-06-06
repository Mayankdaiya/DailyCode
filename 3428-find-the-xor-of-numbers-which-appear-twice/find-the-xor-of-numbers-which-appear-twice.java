class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int arr[]=new int[51];
        for(int i=0;i<nums.length;i++){
            arr[nums[i]]++;
        }
        int res=0;
        for(int i=0;i<51;i++){
            if(arr[i]==2) res^=i;
        }
        return res;
    }
}