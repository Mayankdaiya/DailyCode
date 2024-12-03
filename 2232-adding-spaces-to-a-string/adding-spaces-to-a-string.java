class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder res=new StringBuilder();
        int i=0, j=0;
        while(i<s.length()){
            if(j<spaces.length && i==spaces[j]){
                res.append(" "+s.charAt(i));
                j++;
            } else res.append(s.charAt(i));
            i++;
        }
        return res.toString();
    }
}