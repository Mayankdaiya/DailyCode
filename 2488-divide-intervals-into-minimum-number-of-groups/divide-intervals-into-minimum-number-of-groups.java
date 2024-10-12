class Solution {
    public int minGroups(int[][] intervals) {
        int size=0, n=intervals.length;
        for(int i=0;i<n;i++){
            size=Math.max(size,intervals[i][1]);
        }
        int arr[]=new int[size+2];
        for(int i=0;i<n;i++){
            arr[intervals[i][0]]++;
            arr[intervals[i][1]+1]--;
        }
        int res=0;
        for(int i=1;i<=size+1;i++){
            arr[i]+=arr[i-1];
            res=Math.max(res,arr[i]);
        }
        return res==0?1:res;
    }
}