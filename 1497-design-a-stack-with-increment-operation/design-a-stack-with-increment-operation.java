class CustomStack {
    int st[];
    int in;
    public CustomStack(int maxSize) {
        st=new int[maxSize];
        in=-1;
    }
    
    public void push(int x) {
        if(in+1<st.length) st[++in]=x;
    }
    
    public int pop() {
        if(in==-1) return -1;
        else return st[in--];
    }
    
    public void increment(int k, int val) {
        int l=Math.min(k-1,in);
        for(int i=0;i<=l;i++){
            st[i]+=val;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */