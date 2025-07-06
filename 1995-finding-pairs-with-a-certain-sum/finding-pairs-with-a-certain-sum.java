class FindSumPairs {
    HashMap<Integer,Integer> map;
    int arr1[];
    int arr2[];
    public FindSumPairs(int[] nums1, int[] nums2) {
        arr1=nums1;
        arr2=nums2;
        map=new HashMap<>();
        for(int i=0;i<nums2.length;i++){
            map.put(nums2[i],map.getOrDefault(nums2[i],0)+1);
        }
    }
    
    public void add(int index, int val) {
        if(map.get(arr2[index])>1) map.put(arr2[index],map.get(arr2[index])-1);
        else map.remove(arr2[index]);
        arr2[index]+=val;
        map.put(arr2[index],map.getOrDefault(arr2[index],0)+1);
    }
    
    public int count(int tot) {
        int c=0;
        for(int i=0;i<arr1.length;i++){
            if(map.containsKey(tot-arr1[i])) c+=map.get(tot-arr1[i]);
        }
        return c;
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */