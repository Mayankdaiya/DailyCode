class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int in=1;
        int res[]=new int[2];
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                res[1]=res[1]^in++;
                if(set.contains(grid[i][j])) res[0]=grid[i][j];
                else {
                    set.add(grid[i][j]);
                    res[1]=res[1]^grid[i][j];
                }
            }
        }
        return res;
    }
}