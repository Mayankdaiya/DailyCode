class Solution {
    public char[][] rotateTheBox(char[][] box) {
        int m=box.length, n=box[0].length;
        char arr[][]=new char[n][m];
        for(int i=0;i<m;i++){
            for(int j=0;j<n-1;j++){
                int t=j+1;
                if(box[i][j]=='#'){
                    if(box[i][t]=='.'){
                        box[i][t]='#';
                        box[i][j]='.';
                    } else if(box[i][t]=='#'){
                        while(t<n && box[i][t]=='#'){
                            t++;
                        }
                        if(t<n && box[i][t]=='.'){
                            box[i][t]='#';
                            box[i][j]='.';
                        } 
                    }
                }
            }
            int k=m-i-1;
            for(int j=0;j<n;j++){
                arr[j][k]=box[i][j];
            }
        }
        return arr;
    }
}