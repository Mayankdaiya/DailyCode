class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        Map<Character,Integer> map=new HashMap<>();
        int maxlen=-1;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(map.containsKey(ch)){
                maxlen=Math.max(maxlen,i-map.get(ch)-1);
            } else map.put(ch,i);
        }
        return maxlen;
    }
}