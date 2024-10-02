class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int a[]=arr.clone();
        Arrays.sort(a);
        Map<Integer,Integer> map=new HashMap<>();
        int rank=1;
        for(int i=0;i<a.length;i++){
            if(!map.containsKey(a[i])){
                map.put(a[i],rank++);
            }
        }
        for(int i=0;i<a.length;i++){
            arr[i]=map.get(arr[i]);
        }
        return arr;
    }
}