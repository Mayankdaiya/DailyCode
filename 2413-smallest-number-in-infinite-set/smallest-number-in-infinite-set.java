class SmallestInfiniteSet {
    TreeSet<Integer> set;
    int i;
    public SmallestInfiniteSet() {
        set = new TreeSet<>();
        i = 1;
    }
    
    public int popSmallest() {
        int t = i;
        if(!set.isEmpty() && set.first()<i) return (int)set.pollFirst();
        else return i++;
    }
    
    public void addBack(int num) {
        if(num<i) set.add(num);
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */