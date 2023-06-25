class Solution {
    public int numberOfBeams(String[] bank) {
        int beam=0, temp=0;
        for(int i=0;i<bank.length;i++){
            int t=0;
            for(int j=0;j<bank[i].length();j++){
                if(bank[i].charAt(j)=='1') t++;
            }
            if(temp==0) temp=t;
            else if(t!=0){
                beam+=(temp*t);
                temp=t;
            }
        }
        return beam;
    }
}