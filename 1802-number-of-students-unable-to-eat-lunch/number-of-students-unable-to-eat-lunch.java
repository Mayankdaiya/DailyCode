class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int one=0, zero=0, n=students.length;
        for(int i=0;i<n;i++){
            if(students[i]==0) zero++;
            else one++;
        }
        for(int i=0;i<n;i++){
            if(sandwiches[i]==1) one--;
            else zero--;
            if(one==-1 || zero==-1){
                return n-i;
            }
        }
        return 0;
    }
}