class AllOne {
    Map<String,Integer> map;
    TreeSet<Pair<Integer,String>> set;
    public AllOne() {
        map=new HashMap<>();
        set=new TreeSet<>((a,b)-> {
            if(a.getKey().equals(b.getKey())) return a.getValue().compareTo(b.getValue());
            else return a.getKey()-b.getKey();
        });
    }
    
    public void inc(String key) {
        int i=map.getOrDefault(key,0);
        map.put(key,i+1);
        set.remove(new Pair<>(i,key));
        set.add(new Pair<>(i+1,key));
    }
    
    public void dec(String key) {
        int i=map.get(key);
        set.remove(new Pair<>(i,key));
        if(i==1) map.remove(key);
        else {
            map.put(key,i-1);
            set.add(new Pair<>(i-1,key));
        }
    }
    
    public String getMaxKey() {
        return set.isEmpty()?"":set.last().getValue();
    }
    
    public String getMinKey() {
        return set.isEmpty()?"":set.first().getValue();
    }
}

/**
 * Your AllOne object will be instantiated and called as such:
 * AllOne obj = new AllOne();
 * obj.inc(key);
 * obj.dec(key);
 * String param_3 = obj.getMaxKey();
 * String param_4 = obj.getMinKey();
 */