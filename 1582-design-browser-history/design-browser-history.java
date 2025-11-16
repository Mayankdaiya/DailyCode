class Node {
    String url;
    Node next, pre;
    public Node(String d){
        url = d;
    }
}
class BrowserHistory {
    Node head;
    public BrowserHistory(String homepage) {
        head = new Node(homepage);
    }
    
    public void visit(String url) {
        Node temp = head;
        Node n = new Node(url);
        head.next = n;
        head = n;
        head.pre = temp;
    }
    
    public String back(int steps) {
        while(steps-->0 && head.pre!=null){
            head = head.pre;
        }
        return head.url;
    }
    
    public String forward(int steps) {
        while(steps-->0 && head.next!=null){
            head = head.next;
        }
        return head.url;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */