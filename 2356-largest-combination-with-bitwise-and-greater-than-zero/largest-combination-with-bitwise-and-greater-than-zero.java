class Solution {
    public int largestCombination(int[] candidates) {
        int map[]=new int[24];
        int length=0;
        for(int i=0;i<candidates.length;i++){
            int el=candidates[i], p=1, in=0;
            while(el>0){
                if((el&p)==p){
                   map[in]++; 
                   length=Math.max(length,map[in]); 
                   el-=p;
                }
                p*=2; in++;
            }
        }
        return length;
    }
}