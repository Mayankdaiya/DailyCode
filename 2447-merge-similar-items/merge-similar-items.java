class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<items1.length;i++){
            map.put(items1[i][0],map.getOrDefault(items1[i][0],0)+items1[i][1]);
        }
        for(int i=0;i<items2.length;i++){
            map.put(items2[i][0],map.getOrDefault(items2[i][0],0)+items2[i][1]);
        }
        List<List<Integer>> res=new ArrayList<>();
        int i=0;
        for(int key:map.keySet()){
            res.add(new ArrayList<>());
            res.get(i).add(key); res.get(i++).add(map.get(key));
        }
        Collections.sort(res,new Comparator<>(){
            public int compare(List<Integer> a,List<Integer> b){
                return a.get(0)-b.get(0);
            }
        });
        return res;
    }
}