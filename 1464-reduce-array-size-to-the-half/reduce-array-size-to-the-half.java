class Solution {
    public int minSetSize(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int key:map.keySet()){
            pq.add(map.get(key));
        }
        int n=arr.length/2, curr=0, set=0;
        while(curr<n){
            curr+=pq.poll();;
            set++;
        }
        return set;
    }
}