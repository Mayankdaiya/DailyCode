class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> res=new ArrayList<>();
        int arr[]=new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']=i;
        }
        int pre=0, curr=0;
        for(int i=0;i<s.length();i++){
            curr=Math.max(curr,arr[s.charAt(i)-'a']);
            if(i==curr){
                res.add(curr-pre+1);
                pre=i+1; curr++;
            }
        }
        return res;
    }
}
