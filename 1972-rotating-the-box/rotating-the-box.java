class Solution {
    public char[][] rotateTheBox(char[][] box) {
        for(int i=0;i<box.length;i++){
            int in=-1;
            for(int j=0;j<box[i].length;j++){
                if(box[i][j]=='#'){
                    if(in==-1 || (in<box[0].length && box[i][in]=='#')){
                        in=j;
                        while(in<box[0].length-1){
                            if(box[i][in]=='.' || box[i][in]=='*') break;
                            in++;
                        }
                    }
                    if(in==box[0].length-2) System.out.println("fds"+j);
                    if(in<box[0].length && box[i][in]=='.'){
                        box[i][j]='.'; box[i][in]='#';
                        in++;
                    } 
                } else if(box[i][j]=='*') in=-1;
            }
        }
        for(int i=0;i<box.length;i++){
            System.out.println(Arrays.toString(box[i]));
        }
        char ans[][]=new char[box[0].length][box.length];
        for(int i=0;i<box[0].length;i++){
            for(int j=0;j<box.length;j++){
                ans[i][j]=box[box.length-1-j][i];
            }
        }
        return ans;
    }
}