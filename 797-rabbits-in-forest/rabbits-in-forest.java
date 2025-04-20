class Solution {
    public int numRabbits(int[] answers) {
        int size = 0;
        for(int i=0;i<answers.length;i++){
            size = Math.max(answers[i]+1,size);
        }
        int arr[] = new int[size];
        for(int i=0;i<answers.length;i++){
            arr[answers[i]]++;
        }
        int rabbits = arr[0] ;
        for(int i=1;i<size;i++){
            int t=arr[i]/(i+1);
            if(arr[i]%(i+1)!=0) t++;
            rabbits+=(t*(i+1)); 
        }
        return rabbits;
    }
}
