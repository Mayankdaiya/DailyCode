class Solution {
    public class val{
        int d, p;
        public val(int diff, int prof){
            d=diff;
            p=prof;
        }
    }
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int n=difficulty.length;
        val obj[]=new val[n];
        for(int i=0;i<n;i++){
            obj[i]=new val(difficulty[i],profit[i]);
        }
        Arrays.sort(obj,new Comparator<>(){
            public int compare(val a, val b){
                return a.d-b.d;
            }
        });
        for(int i=1;i<n;i++){
            obj[i].p=Math.max(obj[i-1].p,obj[i].p);
        }
        for(int i=n-2;i>0;i--){
            if(obj[i].d==obj[i+1].d){
                obj[i].p=obj[i+1].p;
            }
        }
        int maxProfit=0, minDiff=obj[0].d;
        for(int w=0;w<worker.length;w++){
            if(worker[w]<minDiff) continue;
            int i=0, j=n-1, in=-1;
            while(i<=j){
                int mid=i+(j-i)/2;
                int dif=obj[mid].d;
                if(worker[w]<dif) j=mid-1;
                else if(worker[w]>dif) i=mid+1;
                else {
                    in=mid;
                    break;
                }
            }
            if(in==-1){
                in=Math.min(i,j);
            }
            maxProfit+=obj[in].p;
        }
        return maxProfit;
    }
}