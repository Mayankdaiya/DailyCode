class Solution {
    public int compareVersion(String version1, String version2) {
        int t1=0, t2=0, i=0, j=0;
        while(i<version1.length() && j<version2.length()){
            while(i<version1.length() && version1.charAt(i)!='.'){
                t1=t1*10+(char)(version1.charAt(i)-'0');
                i++;
            }
            while(j<version2.length() && version2.charAt(j)!='.'){
                t2=t2*10+(char)(version2.charAt(j)-'0');
                j++;
            }
            System.out.println(t1+" "+t2);
            if(t1>t2) return 1;
            else if(t2>t1) return -1;
            t1=0; t2=0; i++; j++;
        }
        while(i<version1.length()){
            if(version1.charAt(i)!='0' && version1.charAt(i)!='.') return 1;
            i++;
        }
        while(j<version2.length()){
            if(version2.charAt(j)!='0' && version2.charAt(j)!='.') return -1;
            j++;
        }
        return 0;
    }
}