class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int extra) {
        for(int i=0;i<capacity.length;i++){
            capacity[i]-=rocks[i];
        }
        Arrays.sort(capacity);
        int b=0;
        for(int i:capacity){
            if(extra-i<0) break;
            b++; extra-=i;
        }
        return b;
    }
}