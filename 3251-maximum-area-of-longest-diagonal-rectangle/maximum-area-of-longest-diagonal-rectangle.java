class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double res=0;
        int area=0;
        for(int i=0;i<dimensions.length;i++){
            int l=dimensions[i][0], w=dimensions[i][1];
            if(Math.sqrt(l*l+w*w)>res){
                res = Math.sqrt(l*l+w*w);
                area = l*w;
            } else if(Math.sqrt(l*l+w*w)==res){
                area = Math.max(area, l*w);
            }
        }
        return area;
    }
}