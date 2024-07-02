class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int res[];
        if(nums1.length<nums2.length){
            res=getIntersection(nums1,nums2);
        } else res=getIntersection(nums2,nums1);
        return res;
    }
    public int[] getIntersection(int arr1[],int arr2[]){
        Map<Integer,Integer> map=new HashMap<>();
        List<Integer> list=new ArrayList<>();
        for(int i:arr1){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i:arr2){
            if(map.isEmpty()) break;
            if(map.containsKey(i)){
                if(map.get(i)==1) map.remove(i);
                else map.put(i,map.get(i)-1);
                list.add(i);
            }
        }
        int res[]=new int[list.size()];
        for(int i=0;i<list.size();i++){
            res[i]=list.get(i);
        }
        return res;
    }
}