class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        Map<Character,Integer> freq=new HashMap<>();
        for(int i=0;i<words2.length;i++){
            String s=words2[i];
            Map<Character,Integer> map=new HashMap<>();
            for(int j=0;j<s.length();j++){
                map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
            }
            for(char k:map.keySet()){
                if(!freq.containsKey(k)) freq.put(k,map.get(k));
                else freq.put(k,Math.max(map.get(k),freq.get(k)));
            }
        }
        List<String> list=new ArrayList<>();
        for(int i=0;i<words1.length;i++){
            String s=words1[i];
            Map<Character,Integer> map=new HashMap<>();
            for(int j=0;j<s.length();j++){
                map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
            }
            int f=0;
            for(char k:freq.keySet()){
                if(!map.containsKey(k) || map.get(k)<freq.get(k)){
                    f=1;
                    break;
                }
            }
            if(f==0) list.add(s);
        }
        return list;
    }
}