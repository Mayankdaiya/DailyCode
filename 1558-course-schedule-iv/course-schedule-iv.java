class Solution {
    public List<Boolean> checkIfPrerequisite(int num, int[][] pre, int[][] que) {
        boolean map[][]=new boolean[num][num];
        List<Boolean> res=new ArrayList<>();
        for(int p[]:pre){
            map[p[0]][p[1]]=true;
        }
        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                for(int k=0;k<num;k++){
                    map[j][k]=map[j][k] || (map[j][i] && map[i][k]);
                }
            }
        }
        for(int q[]:que){
            res.add(map[q[0]][q[1]]);
        }
        return res;
    }
}