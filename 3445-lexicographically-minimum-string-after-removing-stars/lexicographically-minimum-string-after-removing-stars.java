class Solution {
    public String clearStars(String s) {
        TreeMap<Character,List<Integer>> map=new TreeMap<>();
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='*'){
                char ch=map.firstKey();
                int size=map.get(ch).size()-1, in=map.get(ch).get(size);
                map.get(ch).remove(size);
                if(size==0) map.remove(ch);
                set.add(in);
                continue;
            } 
            if(!map.containsKey(s.charAt(i))) map.put(s.charAt(i),new ArrayList<>());
            map.get(s.charAt(i)).add(i);
        }
        StringBuilder res=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='*' && !set.contains(i)){
                res.append(s.charAt(i));
            } 
        }
        return res.toString();
    }
}