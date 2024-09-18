class Solution {
    public String largestNumber(int[] nums) {
        int n=nums.length;
        Integer arr[]=new Integer[n];
        for(int i=0;i<n;i++) arr[i]=nums[i];
        Arrays.sort(arr,new Comparator<Integer>(){
            public int compare(Integer a,Integer b){
                String x=""+a, y=""+b;
                int in=0;
                while(in<(x.length()+y.length())){
                    int t1=in%x.length(), t2=in%y.length();
                    if(x.charAt(t1)!=y.charAt(t2)) return y.charAt(t2)-x.charAt(t1);
                    else in++; 
                }
                return y.charAt(in%y.length())-x.charAt(in%x.length());
            }
        });
        StringBuilder res=new StringBuilder();
        for(int el:arr){
            res.append(el);
        }
        if(res.charAt(0)=='0') return "0";
        return res.toString();
    }
}