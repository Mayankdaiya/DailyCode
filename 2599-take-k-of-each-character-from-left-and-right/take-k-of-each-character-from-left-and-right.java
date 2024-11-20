class Solution {
    public int takeCharacters(String s, int k) {
        int f[]=new int[3];
        int n=s.length();
        for(int i=0;i<n;i++){
            f[s.charAt(i)-'a']++;
        }
        if(f[0]<k || f[1]<k || f[2]<k) return -1;
        f[0]-=k; f[1]-=k; f[2]-=k;
        int win[]=new int[3];
        int i=0, max=0;
        for(int j=0;j<n;j++){
            win[s.charAt(j)-'a']++;
            while(win[0]>f[0] || win[1]>f[1] || win[2]>f[2]){
                win[s.charAt(i)-'a']--;
                i++;
            }
            max=Math.max(max,j-i+1);
        }
        return n-max;
    }
}