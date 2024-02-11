class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int s1=0, s2=0, f=0;
        int t=Math.min(start,destination);
        destination=Math.max(start,destination);
        start=t;
        for(int i=start;i<destination;i++){
            s1+=distance[i];
        }
        for(int i=destination;i<distance.length;i++) s2+=distance[i];
        for(int i=0;i<start;i++) s2+=distance[i];
        return Math.min(s1,s2);
    }
}