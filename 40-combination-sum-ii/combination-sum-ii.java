class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list=new ArrayList<>();
        LinkedList<Integer> ans=new LinkedList<>();
        Arrays.sort(candidates);
        GetTheCombination(candidates,list,ans,target,0);
        return list;
    }
    public static void GetTheCombination(int[] c,List<List<Integer>> list,LinkedList<Integer> ans,int t,int in){
        if(t==0){
            list.add(new ArrayList<>(ans));
            return;
        }
        else if(t<0) return;
        for(int i=in;i<c.length;i++){
            if(i!=in && c[i]==c[i-1]) continue;
            if(t>=c[i]){
                ans.add(c[i]);
                GetTheCombination(c,list,ans,t-c[i],i+1);
                ans.removeLast();
            } 
            
        }
    }
}