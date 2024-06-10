class Solution {
    public int heightChecker(int[] heights) {
        int l=heights.length;
        int exp[]=new int[l];
        for(int i=0;i<l;i++){
            exp[i]=heights[i];
        }
        Arrays.sort(exp);
        int res=0;
        for(int i=0;i<l;i++){
            if(exp[i]!=heights[i]){
                res++;
            }
        }
        return res;
    }
    
}