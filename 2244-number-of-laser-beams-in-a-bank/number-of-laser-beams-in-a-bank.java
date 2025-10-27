class Solution {
    public int numberOfBeams(String[] bank) {
        int pre = 0, res = 0;
        for(int i=0;i<bank.length;i++){
            int c = 0;
            for(int j=0;j<bank[i].length();j++){
                if(bank[i].charAt(j)=='1') c++;
            }
            if(pre!=0) res += pre*c;
            if(c!=0) pre = c;
        }
        return res;
    }
}