class Solution {
    public String makeFancyString(String s) {
        StringBuilder res=new StringBuilder();
        res.append(s.charAt(0));
        int f=0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                if(f==1) continue;
                res.append(s.charAt(i));
                f++;
            } else {
                f=0;
                res.append(s.charAt(i));
            }
        }
        return res.toString();
    }
}