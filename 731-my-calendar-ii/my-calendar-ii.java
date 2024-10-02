class MyCalendarTwo {
    private TreeMap<Integer, Integer> events;

    public MyCalendarTwo() {
        events = new TreeMap<>();
    }
    
    public boolean book(int start, int end) {
        events.put(start, events.getOrDefault(start, 0) + 1);
        events.put(end, events.getOrDefault(end, 0) - 1);
        int activeBookings = 0;
        for (int count : events.values()) {
            activeBookings += count;
            if (activeBookings >= 3) {
                events.put(start, events.get(start) - 1);
                events.put(end, events.get(end) + 1);

                // Remove from map if count reaches zero
                if (events.get(start) == 0) {
                    events.remove(start);
                }
                if (events.get(end) == 0) {
                    events.remove(end);
                }
                
                return false; // Booking failed
            }

            if (events.higherKey(start) != null && events.higherKey(start) > end) {
                break; 
            }
        }
        return true;
    }
}