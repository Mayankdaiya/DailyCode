class Solution {
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int n=startTime.length;
        int arr[][]=new int[n][3];
        for(int i=0;i<n;i++){
            arr[i][0]=startTime[i];
            arr[i][1]=endTime[i];
            arr[i][2]=profit[i];
        }
        Arrays.sort(arr,new Comparator<int[]>(){
            public int compare(int a[],int b[]){
                return a[1]-b[1];
            }
        });
        return getMaxProfit(arr,n);
    }
    public static int getMaxProfit(int arr[][],int n){
        TreeMap<Integer,Integer> dp=new TreeMap<>();
        dp.put(0,0);
        for(int a[]:arr){
            int val=a[2]+dp.floorEntry(a[0]).getValue();
            if(val>dp.lastEntry().getValue()) dp.put(a[1],val);
        }
        return dp.lastEntry().getValue();
    }
}