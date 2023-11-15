class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character,Character> map=new HashMap<>();
        char ch='a';
        for(int i=0;i<key.length();i++){
            if(key.charAt(i)==' ') continue;
            if(!map.containsKey(key.charAt(i))){
                map.put(key.charAt(i),ch);
                if(ch=='z') break;
                ch++;
            }
        }
        StringBuilder decode=new StringBuilder();
        for(int i=0;i<message.length();i++){
            if(map.containsKey(message.charAt(i))){
                decode.append(map.get(message.charAt(i)));
            } else decode.append(message.charAt(i));
        }
        return decode.toString();
    }
}