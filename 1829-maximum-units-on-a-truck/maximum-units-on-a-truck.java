class Solution {
    public int maximumUnits(int[][] boxType, int truckSize) {
        Arrays.sort(boxType,(a,b)->b[1]-a[1]);
        int res = 0, c=truckSize;
        for(int i=0;i<boxType.length;i++){
            if(boxType[i][0]>truckSize){
                boxType[i][0] = truckSize;
            }
            res += (boxType[i][0]*boxType[i][1]);
            truckSize -= boxType[i][0];
            if(truckSize==0) break;
        }
        return res;
    }
}