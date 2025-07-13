class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int in=0, res=0;
        for(int i=0;i<trainers.length && in<players.length;i++){
            if(trainers[i]>=players[in]){
                in++; res++;
            }
        }
        return res;
    }
}