import java.util.*;

class Solution{
    public static int getFibonacci(int n){
        if(n<2) return n;
        return getFibonacci(n-1)+getFibonacci(n-2);
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(getFibonacci(n));
    }
}