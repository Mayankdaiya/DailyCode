class Solution {
    public class Value{
        int p, c;
        public Value(int profit, int capital){
            this.p=profit;
            this.c=capital;
        }
    } 
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int n=profits.length;
        Value obj[]=new Value[n];
        for(int i=0;i<profits.length;i++){
            obj[i]=new Value(profits[i],capital[i]);
        }
        Arrays.sort(obj,new Comparator<Value>(){
            public int compare(Value a,Value b){
                return a.c-b.c;
            }
        });
        PriorityQueue<Integer> queue = new PriorityQueue<>((x, y) -> y - x);
        int i=0;
        for(int in=0;in<k;in++){
            while(i<n && obj[i].c<=w){
                queue.add(obj[i].p);
                i++;
            }
            if(queue.isEmpty()) break;
            else w+=queue.poll();
        }
        return w;
    }
}