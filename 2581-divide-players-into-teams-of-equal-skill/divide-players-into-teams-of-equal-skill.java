class Solution {
    public long dividePlayers(int[] skill) {
        Map<Integer,Integer> map=new HashMap<>();
        int sum=0;
        for(int el:skill){
            map.put(el,map.getOrDefault(el,0)+1);
            sum+=el;
        } 
        long res=0;
        sum=sum*2/skill.length;
        for(int el:skill){
            if(!map.containsKey(el)) continue;
            map.put(el,map.get(el)-1);
            if(map.get(el)==0) map.remove(el);
            int t=sum-el;
            if(map.containsKey(t)){
                res+=(el*t);
                map.put(t,map.get(t)-1);
                if(map.get(t)==0) map.remove(t);
            } else return -1;
        }
        return res;
    }
}