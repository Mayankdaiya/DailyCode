class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int map[]=new int[1001];
        for(int i=0;i<arr.length;i++){
            map[arr[i]]++;
            map[target[i]]--;
        }
        for(int i=0;i<1001;i++){
            if(map[i]!=0) return false;
        }
        return true;
    }
}