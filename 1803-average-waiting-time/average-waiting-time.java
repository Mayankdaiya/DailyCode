class Solution {
    public double averageWaitingTime(int[][] customers) {
        double res=0, curTime=customers[0][0];
        for(int i=0;i<customers.length;i++){
            if(curTime<customers[i][0]) curTime=customers[i][0];
            curTime+=customers[i][1];
            res+=(curTime-customers[i][0]);
        }
        return res/customers.length;
    }
}