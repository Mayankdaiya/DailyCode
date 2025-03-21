class Solution {
    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        Set<String> set=new HashSet<>();
        for(int i=0;i<supplies.length;i++){
            set.add(supplies[i]);
        }
        List<String> ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<recipes.length;i++) list.add(i);
        int pre=0;
        while(list.size()!=pre){
            List<Integer> cur=new ArrayList<>();
            for(int i=0;i<list.size();i++){
                int f=0, in=list.get(i);
                for(int j=0;j<ingredients.get(in).size();j++){
                    if(!set.contains(ingredients.get(in).get(j))){
                        f=1;
                        break;
                    }
                }
                if(f==0){
                    ans.add(recipes[in]);
                    set.add(recipes[in]);
                } else {
                    cur.add(in);
                }
            }
            pre=list.size();
            list=cur;
        }
        return ans;
    }
}