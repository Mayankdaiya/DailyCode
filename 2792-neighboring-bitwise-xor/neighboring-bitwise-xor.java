class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        // int last=derived[derived.length-1];
        for(int i=derived.length-2;i>=0;i--){
            if(derived[i]==1){
                derived[i]=derived[i+1]==0?1:0;
            } else {
                derived[i]=derived[i+1]==0?0:1;
            }
        }
        return derived[derived.length-1]==(derived[derived.length-1]^derived[0]);
    }
}