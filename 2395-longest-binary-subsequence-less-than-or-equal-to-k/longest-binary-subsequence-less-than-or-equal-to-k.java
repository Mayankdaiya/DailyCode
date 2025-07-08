class Solution {
    public int longestSubsequence(String s, int k) {
        int z=0, o=0;
        long val=0, pow=1;
        for(char c:s.toCharArray()){
            if(c=='0') z++;
        }
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='1'){
                if(val+pow>k) continue;
                val+=pow;
                o++;
            }
            pow<<=1;
            if(pow>k) break;
        }
        return z+o;
    }
}