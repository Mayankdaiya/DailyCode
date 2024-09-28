class MyCircularDeque {
    int arr[];
    int f, l, n, c;
    public MyCircularDeque(int k) {
        arr=new int[k];
        Arrays.fill(arr,-1);
        f=k; l=k-1; n=k;
    }
    
    public boolean insertFront(int value) {
        if(c==n) return false;
        f--; c++;
        if(f==-1) f=n-1;
        arr[f%n]=value;
        return true;
    }
    
    public boolean insertLast(int value) {
        if(c==n) return false;
        l++; c++;
        arr[l%n]=value;
        return true;
    }
    
    public boolean deleteFront() {
        if(c==0) return false;
        arr[f%n]=-1;
        f++; c--;
        return true;
    }
    
    public boolean deleteLast() {
        if(c==0) return false;
        arr[l%n]=-1;
        if(l==0) l=n-1;
        else l--;
        c--;
        return true;
    }
    
    public int getFront() {
        return arr[f%n];
    }
    
    public int getRear() {
        return arr[l%n];
    }
    
    public boolean isEmpty() {
        return c==0;
    }
    
    public boolean isFull() {
        return c==n;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */