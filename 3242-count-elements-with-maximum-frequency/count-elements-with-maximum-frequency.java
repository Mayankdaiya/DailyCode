class Solution {
    public int maxFrequencyElements(int[] nums) {
        int arr[]=new int[101];
        for(int i=0;i<nums.length;i++) arr[nums[i]]++;
        int fr=0, num=0;
        for(int i=0;i<101;i++){
            if(arr[i]>fr){
                fr=arr[i]; num=1;
            } else if(arr[i]==fr){
                num++;
            }
        }
        return num*fr;
    }
}