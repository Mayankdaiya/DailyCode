class Solution {
    public String removeOccurrences(String s, String part) {
        while(true){
            String str=getString(s,part);
            if(str.length()==s.length()) break;
            else s=str;
        }
        return s;
    }
    public static String getString(String s,String part){
        StringBuilder str=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.substring(i).startsWith(part)){
                str.append(s.substring(i+part.length()));
                break;
            } else str.append(s.charAt(i));
        }
        return str.toString();
    }
}