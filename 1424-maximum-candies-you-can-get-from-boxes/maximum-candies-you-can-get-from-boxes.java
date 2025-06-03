class Solution {
    public int maxCandies(int[] status, int[] candies, int[][] keys, int[][] containedBoxes, int[] initialBoxes) {
        int maxCandies=0;
        Queue<Integer> q=new LinkedList<>();
        Set<Integer> set=new HashSet<>();
        Set<Integer> vis=new HashSet<>();
        for(int i:initialBoxes){
            q.add(i);
        }
        while(!q.isEmpty()){
            int box=q.poll();
            if(vis.contains(box)) continue;
            if(status[box]==1){
                vis.add(box);
                maxCandies+=candies[box];
                for(int j:containedBoxes[box]){
                    q.add(j);
                }
                for(int key:keys[box]){
                    status[key]=1;
                    if(set.contains(key)) q.add(key);
                }
            } else set.add(box);
        }
        return maxCandies;
    }
}