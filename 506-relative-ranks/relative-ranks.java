class Solution {
    public String[] findRelativeRanks(int[] score) {
        String res[]=new String[score.length];
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<score.length;i++){
            map.put(score[i],i);
        }
        Arrays.sort(score);
        for(int i=0;i<score.length/2;i++){
            int t=score[i];
            score[i]=score[score.length-1-i];
            score[score.length-1-i]=t;
        }
        for(int i=0;i<score.length;i++){
            int t=map.get(score[i]);
            if(i==0) res[t]="Gold Medal";
            else if(i==1) res[t]="Silver Medal";
            else if(i==2) res[t]="Bronze Medal";
            else res[t]=""+(i+1);
        }
        return res;
    }
}