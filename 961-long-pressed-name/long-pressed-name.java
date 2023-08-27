class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int i=-0, in=0;
        while(i<name.length() && in<typed.length()){
            char ch=name.charAt(i);
            if(typed.charAt(in)==ch) in++;
            else if(i>0 && name.charAt(i-1)==typed.charAt(in)){
                while(in<typed.length() && name.charAt(i-1)==typed.charAt(in)) in++;
                if(in<typed.length() && typed.charAt(in)==ch) in++;
                else return false;
            } else return false;
            i++;
        }
        while(in<typed.length() && name.charAt(i-1)==typed.charAt(in)) in++;
        return in==typed.length() && i==name.length();
    }
}