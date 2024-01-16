class RandomizedSet {
    List<Integer> list;
    Random idx;
    public RandomizedSet() {
        list=new ArrayList<>();
        idx=new Random();
    }
    
    public boolean insert(int val) {
        boolean ret=(!list.contains(val));
        if(!list.contains(val)) list.add(val);
        return ret;
    }
    
    public boolean remove(int val) {
        boolean ret=list.contains(val);
        if(list.contains(val)) list.remove(Integer.valueOf(val));
        return ret;
    }
    
    public int getRandom() {
        int in=idx.nextInt(list.size());
        return list.get(in);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */