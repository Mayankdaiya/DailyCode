class Solution {
    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings,(a,b)->a[0]-b[0]);
        int st=meetings[0][0], en=meetings[0][1];
        for(int i=1;i<meetings.length;i++){
            int cs=meetings[i][0], ce=meetings[i][1];
            if(en<cs){
                days-=(en-st+1);
                st=cs; en=ce;
            } else en=Math.max(en,ce);
        }
        days-=(en-st+1);
        return days;
    }
}