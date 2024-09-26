class MyCalendar {
    List<List<Integer>> list;
    public MyCalendar() {
        list=new ArrayList<>();
    }
    
    public boolean book(int start, int end) {
        if(list.isEmpty()){
            list.add(new ArrayList(Arrays.asList(start,end)));
            return true;
        }
        int i=0, j=list.size()-1;
        while(i<j){
            int mid=i+(j-i)/2;
            if(start>=list.get(mid).get(1)){
                i=mid+1;
            } else if(end<=list.get(mid).get(0)){
                j=mid-1;
            } else return false;
        }
        if(start>=list.get(i).get(1)){
            if(i+1<list.size() && end>list.get(i+1).get(0)) return false;
            list.add(i+1,new ArrayList<>(Arrays.asList(start,end)));
            return true;
        } else if(end<=list.get(i).get(0)){
            if(i-1>=0 && start<list.get(i-1).get(1)) return false;
            list.add(i,new ArrayList<>(Arrays.asList(start,end)));
            return true;
        } else return false;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */