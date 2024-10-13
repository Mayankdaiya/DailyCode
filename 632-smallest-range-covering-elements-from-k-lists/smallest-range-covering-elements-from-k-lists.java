class Solution {
    public class Pair{
        int val, in;
        Pair(int val,int in){
            this.val=val;
            this.in=in;
        }
    }
    public int[] smallestRange(List<List<Integer>> nums) {
        int n=nums.size();
        List<Pair> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int el:nums.get(i)) list.add(new Pair(el,i));
        }
        Collections.sort(list, (a, b)-> a.val-b.val);
        int size=list.size(), count=0;
        int res[]={0,Integer.MAX_VALUE};
        int freq[]=new int[n];
        for(int l=0,r=0;r<size;r++){
            int t=++freq[list.get(r).in];
            if(t==1) count++;
            while(count==n){
                int t1=list.get(l).val, t2=list.get(r).val;
                if(t2-t1<res[1]-res[0] || (t2-t1==res[1]-res[0] && t1<res[0])){
                    res[0]=list.get(l).val;
                    res[1]=list.get(r).val;
                }
                int t3=--freq[list.get(l).in];
                if(t3==0) count--;
                l++;
            }
        } 
        return res;
    }
}