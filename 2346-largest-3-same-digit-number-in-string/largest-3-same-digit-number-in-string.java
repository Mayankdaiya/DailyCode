class Solution {
    public String largestGoodInteger(String num) {
        String res = "";
        char ch = '0';
        for(int i=1;i<num.length()-1;i++){
            if(num.charAt(i)==num.charAt(i-1) && num.charAt(i)==num.charAt(i+1)){
                if(num.charAt(i)<ch) continue;
                res = ""+num.charAt(i)+num.charAt(i)+num.charAt(i);
                ch = num.charAt(i);
            }
        }
        return res;
    }
}