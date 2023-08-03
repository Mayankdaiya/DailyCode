class SeatManager {
    int in;
    PriorityQueue<Integer> pq;
    public SeatManager(int n) {
        in=1;
        pq=new PriorityQueue<>();
    }
    
    public int reserve() {
        if(!pq.isEmpty() && pq.peek()<in) return pq.poll();
        else if(!pq.isEmpty() && pq.peek()==in){
            in++; return pq.poll();
        }
        return in++;
    }
    
    public void unreserve(int seatNumber) {
        pq.add(seatNumber);
    }
}

/**
 * Your SeatManager object will be instantiated and called as such:
 * SeatManager obj = new SeatManager(n);
 * int param_1 = obj.reserve();
 * obj.unreserve(seatNumber);
 */