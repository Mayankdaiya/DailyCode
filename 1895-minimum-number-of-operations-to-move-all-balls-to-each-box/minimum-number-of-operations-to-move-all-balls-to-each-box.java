class Solution {
    public int[] minOperations(String boxes) {
        int n=boxes.length(), c1=boxes.charAt(0)=='1'?1:0, c2=boxes.charAt(n-1)=='1'?1:0;
        int arr1[]=new int[n];
        int arr2[]=new int[n];
        for(int i=1;i<n;i++){
            arr1[i]+=arr1[i-1]+c1;
            arr2[n-i-1]+=arr2[n-i]+c2;
            if(boxes.charAt(i)=='1') c1++;
            if(boxes.charAt(n-i-1)=='1') c2++;
        }
        for(int i=0;i<n;i++){
            arr1[i]+=arr2[i];
        }
        return arr1;
    }
}