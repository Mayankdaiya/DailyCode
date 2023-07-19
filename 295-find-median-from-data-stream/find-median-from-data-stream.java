class MedianFinder {
        PriorityQueue<Integer> min;
        PriorityQueue<Integer> max;
        public MedianFinder() {
            min=new PriorityQueue<>();
            max=new PriorityQueue<>(Collections.reverseOrder());
        }

        public void addNum(int num) {
            max.add(num);
            min.add(max.poll());
            if(max.size()<min.size()){
                max.add(min.poll());
            }
        }

        public double findMedian() {
            if(max.size()>min.size()){
                return max.peek();
            } else return (max.peek()+min.peek())/2.0;
        }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */