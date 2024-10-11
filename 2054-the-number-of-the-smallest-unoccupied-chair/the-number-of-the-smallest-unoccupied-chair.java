class Solution {
    public int smallestChair(int[][] times, int targetFriend) {
        int n = times.length;
        List<int[]> events = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            events.add(new int[]{times[i][0], i, 1});  
            events.add(new int[]{times[i][1], i, 0});  
        }
        Collections.sort(events, (a, b) -> a[0] == b[0] ? Integer.compare(a[2], b[2]) : Integer.compare(a[0], b[0]));

        PriorityQueue<Integer> availableChairs = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            availableChairs.offer(i); 
        }

        int[] friendToChair = new int[n];

        for (int[] event : events) {
            int time = event[0];
            int friend = event[1];
            int action = event[2];  
            
            if (action == 1) { 
                int chair = availableChairs.poll();
                friendToChair[friend] = chair;
                if (friend == targetFriend) {
                    return chair;  
                }
            } else { 
                availableChairs.offer(friendToChair[friend]);
            }
        }
        return -1;
    }
}