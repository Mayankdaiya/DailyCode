class Solution {
    public long numberOfPowerfulInt(long start, long finish, int limit, String s) {
        String st = Long.toString(start-1);
        String fin = Long.toString(finish);
        return calculate(fin,s,limit) - calculate(st,s,limit);
    }
    
    private long calculate(String x, String s, int limit){
        if(x.length()<s.length()){
            return 0;
        }
        if(x.length() == s.length()){
            return x.compareTo(s)>=0?1:0;
        }
        String suf=x.substring(x.length()-s.length());
        long count=0;
        int pre=x.length()-s.length();
        for(int i=0;i<pre;i++){
            int dig=x.charAt(i)-'0';
            if(limit<dig){
                count+=(long)Math.pow(limit+1,pre-i);
                return count;
            }
            count+=(long)(dig)*(long)Math.pow(limit+1,pre-1-i);
        }
        if(suf.compareTo(s)>=0){
            count++;
        }
        return count;
    }
}