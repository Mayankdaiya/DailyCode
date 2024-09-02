class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long sum=0;
        for(int i=0;i<chalk.length;i++){
            sum+=chalk[i];
        }
        System.out.println(sum);
        long cur=0;
        k=(int)(k%sum);
        for(int i=0;i<chalk.length;i++){
            k-=chalk[i];
            if(k<0) return i;
        }
        return 0;
    }
}