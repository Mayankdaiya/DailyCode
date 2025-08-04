class Solution {
    public int totalFruit(int[] fruits) {
        int arr[][] = new int[2][2];
        arr[0][0] = -1;  arr[1][0] = -1;
        int max = 0, in = 0;
        for(int i=0;i<fruits.length;i++){
            if(arr[0][0]==-1 || arr[0][0]==fruits[i]){
                arr[0][0] = fruits[i];
                arr[0][1]++;
            } else if(arr[1][0]==-1 || arr[1][0]==fruits[i]){
                arr[1][0] = fruits[i];
                arr[1][1]++;
            } else {
                max = Math.max(max, arr[0][1]+arr[1][1]);
                while(arr[0][0]!=-1 && arr[1][0]!=-1){
                    if(fruits[in]==arr[0][0]){
                        if(arr[0][1]--==1) arr[0][0]=-1;
                    } else {
                        if(arr[1][1]--==1) arr[1][0]=-1;
                    }
                    in++; 
                }
                if(arr[0][0]==-1){
                    arr[0][0] = fruits[i];
                    arr[0][1] = 1;
                } else {
                    arr[1][0] = fruits[i];
                    arr[1][1] = 1;
                }
            }
        }
        int t = 0;
        if(arr[0][0]!=-1) t+=arr[0][1];
        if(arr[1][0]!=-1) t+=arr[1][1];
        return Math.max(max,t);
    }
}