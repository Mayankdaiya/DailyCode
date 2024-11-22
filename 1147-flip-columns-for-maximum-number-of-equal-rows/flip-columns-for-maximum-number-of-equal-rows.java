class Solution {
    public int maxEqualRowsAfterFlips(int[][] matrix) {
        Map<String,Integer> map=new HashMap<>();
        int res=0;
        for(int i=0;i<matrix.length;i++){
            StringBuilder t1=new StringBuilder(), t2=new StringBuilder();
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    t1.append(0);
                    t2.append(1);
                } else {
                    t1.append(1);
                    t2.append(0);
                }
            }
            String s1=t1.toString(), s2=t2.toString();
            map.put(s1,map.getOrDefault(s1,0)+1);
            map.put(s2,map.getOrDefault(s2,0)+1);
            res=Math.max(res,Math.max(map.get(s1),map.get(s2)));
        }
        return res;
    }
}