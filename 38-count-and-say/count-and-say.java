class Solution {
    public String countAndSay(int n) {
        if(n==1) return "1";
        String s = countAndSay(n-1);
        s = getRLE(s);
        return s;
    }
    public String getRLE(String s){
        int c=1;
        StringBuilder str = new StringBuilder();
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(i-1)){
                str.append(c);
                str.append(s.charAt(i-1));
                c=1;
            } else c++;
        }
        str.append(c);
        str.append(s.charAt(s.length()-1));
        return str.toString();
    }
}