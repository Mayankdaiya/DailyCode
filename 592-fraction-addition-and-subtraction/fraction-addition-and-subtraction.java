class Solution {
    public String fractionAddition(String e) {
        int i=0, t1=0, t2=0, n=e.length();
        while(i<n){
            int t3=1, t4=1;
            if(e.charAt(i)=='-'){
                i++; t3=-1;
            } 
            if(e.charAt(i)=='+') i++;
            t3*=(e.charAt(i)-'0'); i++;
            while(i<n && e.charAt(i)>='0' && e.charAt(i)<='9'){
                t3*=10+(e.charAt(i)-'0');
                i++;
            }
            i++;
            if(e.charAt(i)=='-'){
                i++; t4=-1;
            }
            // if(e.charAt(i)=='+') i++;
            t4*=(e.charAt(i)-'0'); i++;
            while(i<n && e.charAt(i)>='0' && e.charAt(i)<='9'){
                t4*=10+(e.charAt(i)-'0');
                i++;
            }
            if(t1==0 && t2==0){
                t1=t3; t2=t4;
            } else {
                int y=t2*t4;
                int x=t1*t4+t3*t2;
                int a[]=get(x,y);
                t1=a[0]; t2=a[1];
            }
        }
        if(t1==0) t2=1;
        if(t2==0) t2=1;
        String str=""+t1+"/"+t2;
        return str;
    }
    public static int[] get(int x,int y){
        int n=Math.max(x,y);
        for(int i=2;i<Math.max(x,y);i++){
            if(i>Math.max(x,y)) break;
            while(x%i==0 && y%i==0){
                x/=i; y/=i;
            }
        }
        return new int[]{x,y};
    }
}