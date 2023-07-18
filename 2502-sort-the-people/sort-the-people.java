class Solution {
    class Pair{
        String name;
        int height;
        Pair(String n,int h){
            this.name=n;
            this.height=h;
        }
    }
    public String[] sortPeople(String[] names, int[] heights) {
        Pair res[]=new Pair[names.length];
        for(int i=0;i<names.length;i++){
            res[i]=new Pair(names[i],heights[i]);
        }
        Arrays.sort(res,new Comparator<Pair>(){
            public int compare(Pair t1,Pair t2){
                return t2.height-t1.height;
            }
        });
        String ans[]=new String[res.length];
        for(int i=0;i<res.length;i++){
            ans[i]=res[i].name;
        }
        return ans;
    }
}