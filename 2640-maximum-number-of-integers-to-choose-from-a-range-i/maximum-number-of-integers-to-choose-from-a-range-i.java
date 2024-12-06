class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<banned.length;i++){
            set.add(banned[i]);
        }
        int s=0, i=1, t=0;
        while(s+i<=maxSum && i<=n){
            if(set.contains(i)){
                i++;
                continue;
            } else {
                s+=i;
                t++; i++;
            }
        }
        System.out.println(s);
        return t;
    }
}