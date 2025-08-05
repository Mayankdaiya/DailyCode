class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int unplaced = 0;
        for(int i=0;i<fruits.length;i++){
            int f = 0;
            for(int j=0;j<baskets.length;j++){
                if(fruits[i]<=baskets[j]){
                    baskets[j] = -1;
                    f = 1;
                    break;
                }
            }
            if(f==0) unplaced++;
        }
        return unplaced;
    }
}