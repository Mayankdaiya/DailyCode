class Solution {
    public boolean checkValidCuts(int n, int[][] rectangles) {
        return getCuts(rectangles,0,2) || getCuts(rectangles,1,3);
    }
    public boolean getCuts(int arr[][],int st,int en){
        Arrays.sort(arr,(a,b)->{
            if(a[st]==b[st]) return a[en]-b[en];
            else return a[st]-b[st];
        });
        int cuts=0, t1=arr[0][st], t2=arr[0][en];
        for(int i=1;i<arr.length && cuts<2;i++){
            if(arr[i][st]>=t2) cuts++;
            t1=arr[i][st]; t2=Math.max(t2,arr[i][en]);
        }
        return cuts==2;
    }
}