class Solution {
    public boolean checkIfExist(int[] arr) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            if(arr[i]==0 && map.get(0)>=2) return true;
            if(arr[i]!=0 && (map.containsKey(2*arr[i]) || (arr[i]%2==0 && map.containsKey(arr[i]/2)))){
                return true;
            }
        }
        return false;
    }
}