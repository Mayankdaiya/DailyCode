class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int arr[]=new int[s.length()+1];
        for(int i=0;i<shifts.length;i++){
            int l=shifts[i][0], r=shifts[i][1];
            if(shifts[i][2]==0){
                arr[l]+=-1; arr[r+1]+=1;
            } else {
                arr[l]+=1; arr[r+1]+=-1;
            }
        }
        for(int i=1;i<arr.length;i++){
            arr[i]+=arr[i-1];
        }
        StringBuilder res=new StringBuilder();
        for(int i=0;i<s.length();i++){
            int t=s.charAt(i)+(arr[i]%26);
            if(t<97){
                char ch=(char)('z'-(96-t));
                res.append(ch);
            } else if(t>122){
                char ch=(char)('a'+(t-123));
                res.append(ch);
            } else res.append((char)t);
        }
        return res.toString();
    }
}