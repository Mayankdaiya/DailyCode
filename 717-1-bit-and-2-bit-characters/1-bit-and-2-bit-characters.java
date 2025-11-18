class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int l=bits.length;
        for(int i=0;i<l;i++){
            if(bits[i]==1){
                i++;
            } else{
                if(i==l-1) return true;
            }
        }
        return false;
    }
}