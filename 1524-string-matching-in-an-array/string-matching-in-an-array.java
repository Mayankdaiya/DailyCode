class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> list=new ArrayList<>();
        Arrays.sort(words,(a,b)->a.length()-b.length());
        for(int i=0;i<words.length;i++){
            String s1=words[i];
            for(int j=i+1;j<words.length;j++){
                if(s1.length()<=words[j].length() && isSubstring(s1,words[j])){ 
                    list.add(s1);
                    break;
                }
            }
        }
        return list;
    }

    public static boolean isSubstring(String s1,String s2){
        int j=s2.length()-s1.length();
        for(int i=0;i<=j;i++){
            if(s1.equals(s2.substring(i,i+s1.length()))){
                return true;
            } 
        }
        return false;
    }
}