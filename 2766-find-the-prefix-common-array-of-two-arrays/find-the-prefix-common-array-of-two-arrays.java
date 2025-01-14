class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int arr[]=new int[A.length+1];
        int res[]=new int[A.length];
        for(int i=0;i<A.length;i++){
            arr[A[i]]++; arr[B[i]]++;
            if(arr[A[i]]==2) res[i]++;
            if(arr[B[i]]==2) res[i]++;
            if(A[i]==B[i]) res[i]--;
            if(i!=0) res[i]+=res[i-1];
        }
        return res;
    }
}