class Solution {
    Set<Character> vow=new HashSet<>();
    public long countOfSubstrings(String s, int k) {
        vow.add('a'); vow.add('e'); vow.add('i');
        vow.add('o'); vow.add('u');
        long a=get(s,k), b=get(s,k+1);
        return a-b;
    }
    public long get(String s,int k){
        int i=0, j=0, cons=0;
        long res=0;
        Map<Character,Integer> map=new HashMap<>();
        while(i<s.length()){
            char ch=s.charAt(i);
            if(vow.contains(ch)){
                map.put(ch,map.getOrDefault(ch,0)+1);
            } else cons++;
            while(map.size()==5 && cons>=k){
                res+=(long)(s.length()-i);
                char ch1=s.charAt(j);
                if(vow.contains(ch1)){
                    if(map.get(ch1)==1) map.remove(ch1);
                    else map.put(ch1,map.get(ch1)-1);
                } else cons--;
                j++;
            }
            i++;
        }
        return res;
    }
}