class StockSpanner {
    List<int[]> list;
    public StockSpanner() {
        list=new ArrayList<>();
    }
    
    public int next(int price) {
        if(list.isEmpty()){
            list.add(new int[]{price,1});
            return 1;
        }
        int t1=list.get(list.size()-1)[0], t2=list.get(list.size()-1)[1], c=t2; 
        if(t1<=price){ 
            int t=list.size()-1-t2;
            while(t>=0){
                if(list.get(t)[0]<=price) c+=list.get(t)[1];
                else break;
                t-=list.get(t)[1];
            }
            list.add(new int[]{price,c+1});
            return c+1;
        }
        list.add(new int[]{price,1});
        return 1;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */