class Solution {
    public int longestPalindrome(String s) {
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        int res=0;
        for(char key:map.keySet()){
            if(map.get(key)%2!=0 && res%2!=0){
                res--;
            }  
            res+=map.get(key);          
        }
        return res;
    }
}