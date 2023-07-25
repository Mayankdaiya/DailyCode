class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        int arr[]=new int[52];
        for(int i=0;i<ranges.length;i++){
            arr[ranges[i][0]]++;
            arr[ranges[i][1]+1]--;
        }
        for(int i=1;i<52;i++){
            arr[i]+=arr[i-1];
            if(left<=i && i<=right){
                if(arr[i]<1) return false;
            }
        }
        return true;
    }
}