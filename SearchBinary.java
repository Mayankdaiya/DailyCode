import java.util.*;
//only for sorted array
class SearchBinary{
    public static int search(int arr[],int si,int ei,int n){
        if(si>ei) return -1;
        int mid=si+(ei-si)/2;
        if(arr[mid]>n) ei=mid-1;
        else if(n>arr[mid]) si=mid+1;
        else return mid;
        return search(arr,si,ei,n);
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int arr[]=new int[len];
        for(int i=0;i<len;i++) arr[i]=sc.nextInt();
        int n=sc.nextInt();
        System.out.println(search(arr,0,len-1,n));
    }
}