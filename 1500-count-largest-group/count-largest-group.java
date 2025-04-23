class Solution {
    public int countLargestGroup(int n) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int maxSize=0, count=0;
        for(int i=1;i<=n;i++){
            int t=digitSum(i);
            map.put(t,map.getOrDefault(t,0)+1);
            maxSize=Math.max(maxSize,map.get(t));
        }
        for(int key:map.keySet()){
            if(map.get(key)==maxSize) count++;
        }
        return count;
    }
    public int digitSum(int n){
        if(n==0) return 0;
        return n%10+digitSum(n/10);
    }
}