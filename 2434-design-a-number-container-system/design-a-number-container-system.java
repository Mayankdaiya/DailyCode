class NumberContainers {
    Map<Integer,Integer> i2n;
    Map<Integer,TreeSet<Integer>> n2i;
    public NumberContainers() {
        i2n=new HashMap<>();
        n2i=new HashMap<>();
    }
    
    public void change(int index, int number) {
        if(i2n.containsKey(index)) n2i.get(i2n.get(index)).remove(index);
        i2n.put(index,number);
        if(!n2i.containsKey(number)) n2i.put(number,new TreeSet<>());
        n2i.get(number).add(index);
    }
    
    public int find(int number) {
        return (n2i.containsKey(number) && !n2i.get(number).isEmpty())?n2i.get(number).first():-1;
    }
}

/**
 * Your NumberContainers object will be instantiated and called as such:
 * NumberContainers obj = new NumberContainers();
 * obj.change(index,number);
 * int param_2 = obj.find(number);
 */