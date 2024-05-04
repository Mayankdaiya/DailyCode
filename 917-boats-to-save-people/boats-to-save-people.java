class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int res=0, i=0, j=people.length-1;
        while(i<=j){
            int t=people[i]+people[j];
            if(t<=limit){
                res++; i++; j--;
            } else if(people[i]<=limit){
                j--; res++;
            } else j--;
        }
        return res;
    }
}