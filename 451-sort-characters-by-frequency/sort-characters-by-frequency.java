class Solution {
    class Pair{
        int f;
        char ch;
        Pair(char ch,int f){
            this.ch=ch;
            this.f=f;
        }
    }
    public String frequencySort(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        PriorityQueue<Pair> pq=new PriorityQueue<>(new Comparator<Pair>(){
            public int compare(Pair p1,Pair p2){
                return p2.f-p1.f;
            }
        });
        for(char key:map.keySet()){
            pq.add(new Pair(key,map.get(key)));
        }
        StringBuilder ans=new StringBuilder();
        while(!pq.isEmpty()){
            Pair t=pq.poll();
            int st=t.f;
            while(st-->0) ans.append(t.ch);
        }
        return ans.toString();
    }
}