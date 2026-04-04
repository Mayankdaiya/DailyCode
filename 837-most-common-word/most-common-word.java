class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String arr[] = paragraph.split("[ !?\"',;.]+");
        Map<String, Integer> map = new HashMap<>();
        for(String str:arr){
            map.put(str.toLowerCase(),map.getOrDefault(str.toLowerCase(),0)+1);
        }
        int max = 0;
        String res = "";
        for(String str:banned){
            map.remove(str);
        }
        for(String key:map.keySet()){
            if(map.get(key)>max){
                max = map.get(key);
                res = key;
            } 
        }
        return res;
    }
}