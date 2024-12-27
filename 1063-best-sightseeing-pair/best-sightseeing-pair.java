class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int n=values.length;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=values[i]-i;
            values[i]+=i;
        }
        for(int i=n-2;i>=0;i--){
            if(arr[i+1]>arr[i]) arr[i]=arr[i+1];
        }
        int res=0;
        for(int i=0;i<n-1;i++){
            if(values[i]+arr[i+1]>res) res=values[i]+arr[i+1];
        }
        return res;
    }
}