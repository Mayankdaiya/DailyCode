class MyQueue {
    Stack<Integer> st1=new Stack<>();
    Stack<Integer> st2=new Stack<>();
    int peek=-1;
    public MyQueue() {
        
    }
    
    public void push(int x) {
        if(st1.isEmpty()) peek=x;
        st1.push(x);
    }
    
    public int pop() {
        while(!st1.isEmpty()){
            st2.push(st1.pop());
        }
        int t=st2.pop();
        if(!st2.isEmpty()) peek=st2.peek();
        while(!st2.isEmpty()){
            st1.push(st2.pop());
        }
        return t;
    }
    
    public int peek() {
        return peek;
    }
    
    public boolean empty() {
        return st1.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */