import java.math.BigInteger;

class Solution {
    public boolean isAdditiveNumber(String num) {
        List<BigInteger> list=new ArrayList<>();
        return isAdditive(num,list);
    }
    public static boolean isAdditive(String str,List<BigInteger> list){
        if(str.length()==0){
            if(list.size()>=3){
                return true;
            }
            return false;
        }
        for(int i=1;i<=str.length();i++){
            String s1=str.substring(0,i);
            if(leading(s1) && validAdditive(list,s1)) {
                list.add(new BigInteger(s1));
                boolean ans=isAdditive(str.substring(i), list);
                if(ans){
                    return ans;
                }
                list.remove(list.size()-1);
            }
        }
        return false;   
    }
    public static boolean leading(String str){
        if(str.length()==1) return true;
        return str.charAt(0)!='0';
    }
    public static boolean validAdditive(List<BigInteger> list,String str){
        if(list.size()<=1) return true; 
        BigInteger f=list.get(list.size()-1);
        BigInteger s=list.get(list.size()-2);
        BigInteger ans=new BigInteger(str);
        return f.add(s).equals(ans);
    }
}