class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String,Integer> map=new HashMap<>();
        int in=0;
        for(String el:list1) map.put(el,in++);
        int min=Integer.MAX_VALUE;
        in=0;
        List<String> res = new ArrayList<>();
        for(String el:list2) {
            if(map.containsKey(el)){
                int t=map.get(el)+in;
                if(t<min) {
                    res.clear();
                    res.add(el);
                    min=t;
                } else if(t==min) {
                    res.add(el);
                }
            }
            in++;
        }
        return res.toArray(new String[0]);
    }
}