class ProductOfNumbers {
    List<Integer> list;
    public ProductOfNumbers() {
        list=new ArrayList<>();
    }
    
    public void add(int num) {
        if(num==0) list.clear();
        else if(list.isEmpty()) list.add(num);
        else list.add(num*list.get(list.size()-1));
    }
    
    public int getProduct(int k) {
        if(k==list.size()) return list.get(list.size()-1);
        else if(k>list.size()) return 0;
        else return list.get(list.size()-1)/list.get(list.size()-k-1);
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */