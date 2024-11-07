class Solution {
    public int largestCombination(int[] candidates) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int length=0;
        for(int i=0;i<candidates.length;i++){
            int el=candidates[i], p=1;
            while(el>0){
                if((el&p)==p){
                   map.put(p,map.getOrDefault(p,0)+1); 
                   length=Math.max(length,map.get(p)); 
                   el-=p;
                }
                p*=2;
            }
        }
        return length;
    }
}