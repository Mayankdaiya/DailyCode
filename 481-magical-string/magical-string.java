class Solution {
    public int magicalString(int n) {
        StringBuilder str=new StringBuilder("122");
        int in=2, c=1;
        while(str.length()<n){
            int len=str.length();
            char ch=str.charAt(in), ch2=str.charAt(len-1);
            if(ch=='2'){
                if(ch2=='2'){ 
                    str.append("11"); c+=2;
                    if(str.length()>n) c--;
                }
                else {
                    str.append("22");
                }
            } else {
                if(ch2=='2'){ 
                    str.append('1'); c++;
                }
                else str.append('2');
            } 
            in++;
        }
        return c;
    }
}