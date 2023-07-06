class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        return getNumOfResults(expression);
    }
    public static List<Integer> getNumOfResults(String str){
        if(str.indexOf('+')==-1 && str.indexOf('-')==-1 && str.indexOf('*')==-1){
            List<Integer> list=new ArrayList<>();
            list.add(Integer.parseInt(str));
            return list;
        }
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(isoperator(ch)){
                List<Integer> left=getNumOfResults(str.substring(0,i));
                List<Integer> right=getNumOfResults(str.substring(i+1));
                for(int j:left){
                    for(int k:right){
                        list.add(Cal(j,k,ch));
                    }
                }
            }
        }
        return list;
    }
    public static boolean isoperator(char ch){
        if(ch=='+' || ch=='-' || ch=='*') return true;
        return false;
    }
    public static int Cal(int a,int b,char ch){
        if(ch=='-') return a-b;
        else if(ch=='+') return a+b;
        else return a*b;
    }
}