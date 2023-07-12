class Solution {
    public List<List<String>> displayTable(List<List<String>> orders) {
        HashMap<String,HashMap<Integer,Integer>> map=new HashMap<>();
        List<Integer> list=new ArrayList<>();
        List<List<String>> ans=new ArrayList<>();
        List<String> table=new ArrayList<>();
        for(int i=0;i<orders.size();i++){
            int t=Integer.parseInt(orders.get(i).get(1));
            String str=orders.get(i).get(2);
            if(!list.contains(t)) list.add(t);
            if(map.containsKey(str)){
                map.get(str).put(t,map.get(str).getOrDefault(t,0)+1);
            } else{
                HashMap<Integer,Integer> m=new HashMap<>();
                m.put(t,1);
                map.put(str,m);
                table.add(str);
            }
        }
        Collections.sort(list);
        Collections.sort(table);
        table.add(0,"Table");
        ans.add(table);
        for(int i=0;i<list.size();i++){
            List<String> or=new ArrayList<>();
            or.add(Integer.toString(list.get(i)));
            for(int j=1;j<table.size();j++){
                int t=map.get(table.get(j)).getOrDefault(list.get(i),0);
                or.add(Integer.toString(t));
            }
            ans.add(or);
        }
        return ans;
    }
}