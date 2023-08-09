class StockSpanner {
    List<Integer> list;
    public StockSpanner() {
        list=new ArrayList<>();
    }
    
    public int next(int price) {
        list.add(price);
        int c=1;
        for(int i=list.size()-2;i>=0;i--){
            if(list.get(i)>price) break;
            c++;
        }
        return c;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */