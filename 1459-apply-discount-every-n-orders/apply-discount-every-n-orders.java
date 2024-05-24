class Cashier {
    Map<Integer,Integer> map;
    int flat, n, c=1;
    public Cashier(int n, int discount, int[] products, int[] prices) {
        flat=discount; this.n=n;
        map=new HashMap<>();
        for(int i=0;i<products.length;i++){
            map.put(products[i],prices[i]);
        }
    }
    
    public double getBill(int[] product, int[] amount) {
        double bill=0;
        for(int i=0;i<product.length;i++){
            bill=bill+(map.get(product[i])*amount[i]);
        }
        if(c==n){ 
            bill=bill*(double)((100-(double)flat)/100);
            c=1;
        }
        else c++;
        return bill;
    }
}

/**
 * Your Cashier object will be instantiated and called as such:
 * Cashier obj = new Cashier(n, discount, products, prices);
 * double param_1 = obj.getBill(product,amount);
 */