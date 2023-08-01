class Solution {
    public int bestClosingTime(String customers) {
        int penalty=0;
        for(int i=0;i<customers.length();i++){
            if(customers.charAt(i)=='Y') penalty++;
        }
        int min=penalty, hour=0;
        for(int i=1;i<customers.length();i++){
            char ch1=customers.charAt(i-1);
            penalty=ch1=='Y'?penalty-1:penalty+1;
            if(penalty<min){
                min=penalty; hour=i;
            }
        }
        if(customers.charAt(customers.length()-1)=='Y') penalty--;
        if(penalty<min) hour=customers.length();
        return hour;
    }
}