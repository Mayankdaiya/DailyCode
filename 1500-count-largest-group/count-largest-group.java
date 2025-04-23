class Solution {
    public int countLargestGroup(int n) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int maxSize=0, count=0;
        for(int i=1;i<=n;i++){
            int t=digitSum(i);
            map.put(t,map.getOrDefault(t,0)+1);
            if(maxSize==map.get(t)) count++;
            else if(maxSize<map.get(t)){
                maxSize=map.get(t);
                count=1;
            }
        }
        return count;
    }
    public int digitSum(int n){
        if(n==0) return 0;
        return n%10+digitSum(n/10);
    }
}