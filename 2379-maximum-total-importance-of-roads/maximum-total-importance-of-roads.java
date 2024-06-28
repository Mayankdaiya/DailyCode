class Solution {
    public long maximumImportance(int n, int[][] roads) {
        int arr[]=new int[n];
        for(int i=0;i<roads.length;i++){
            arr[roads[i][0]]++;
            arr[roads[i][1]]++;
        }
        Arrays.sort(arr);
        long res=0;
        for(int i=0;i<n;i++){
            res+=((long)arr[i]*(i+1));
        }
        return res;
    }
}