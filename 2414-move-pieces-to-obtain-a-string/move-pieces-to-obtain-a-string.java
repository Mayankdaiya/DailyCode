class Solution {
    public boolean canChange(String start, String target) {
        int i=0, j=0;
        while(i<target.length()){
            if(target.charAt(i)=='L'){
                while(j<start.length()){
                    if(start.charAt(j)=='L'){
                        if(j<i) return false;
                        else break;
                    } else if(start.charAt(j)=='R') return false;
                    j++;
                }
                if(j==start.length()) return false;
                j++;
            } else if(target.charAt(i)=='R'){
                while(j<start.length()){
                    if(start.charAt(j)=='R'){
                        if(j>i) return false;
                        else break;
                    } else if(start.charAt(j)=='L') return false;
                    j++;
                }
                if(j==start.length()) return false;
                j++;
            }
            i++;
        }
        while(j<start.length()){
            if(start.charAt(j)!='_') return false;
            j++;
        }
        return true;
    }
}