class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int max=0;
        for(int i=0;i<trips.length;i++){
            if(trips[i][2]>max) max=trips[i][2];
        }   
        int arr[]=new int[max+1];
        for(int i=0;i<trips.length;i++){
            arr[trips[i][1]]+=trips[i][0];
            arr[trips[i][2]]+=-trips[i][0];
        }
        if(arr[0]>capacity) return false;
        for(int i=1;i<=max;i++){
            arr[i]+=arr[i-1];
            if(arr[i]>capacity) return false;
        } 
        return true;
    }
}