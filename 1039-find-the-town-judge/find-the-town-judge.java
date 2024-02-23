class Solution {
    public int findJudge(int n, int[][] trust) {
        if(n==1) return 1;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<trust.length;i++){
            map.put(trust[i][0],map.getOrDefault(trust[i][0],0)-1);
            map.put(trust[i][1],map.getOrDefault(trust[i][1],0)+1);
        }
        for(int key:map.keySet()){
            if(map.get(key)>=(n-1)) return key;
        }
        return -1;
    }
}