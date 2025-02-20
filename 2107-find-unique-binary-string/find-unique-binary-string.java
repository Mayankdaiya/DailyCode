class Solution {
    public String findDifferentBinaryString(String[] nums) {
        Set<String> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        return getString(set,nums.length,"");
    }
    public static String getString(Set<String> set,int n,String res){
        if(res.length()>n) return "";
        if(res.length()==n){
            if(set.contains(res)) return "";
            else return res;
        }
        String s1=getString(set,n,res+'1');
        String s2=getString(set,n,res+'0');
        return s1.length()!=0?s1:s2;
    }
}