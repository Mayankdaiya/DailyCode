class Solution {
    public int maxTwoEvents(int[][] events) {
        Arrays.sort(events, (a,b)-> a[0]-b[0]);
        int n=events.length;
        int arr[]=new int[n];
        arr[n-1]=events[n-1][2];
        for(int i=n-2;i>=0;i--){
            arr[i]=Math.max(events[i][2],arr[i+1]);
        }
        int maxSum=0;
        for(int i=0;i<n;i++){
            int curr=events[i][2];
            int valididx=search(events,events[i][1]+1);
            if(valididx!=-1) curr+=arr[valididx];
            maxSum=Math.max(maxSum,curr);
        }
        return maxSum;
    }
    public static int search(int events[][],int target){
        int l=0, r=events.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(events[mid][0]>=target){
                r=mid-1;
            } else l=mid+1;
        }
        return l<events.length?l:-1;
    }
}