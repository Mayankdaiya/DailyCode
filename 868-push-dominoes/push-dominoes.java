class Solution {
    public String pushDominoes(String dom) {
        Queue<Integer> q=new LinkedList<>();
        int n=dom.length();
        for(int i=0;i<n;i++){
            if(dom.charAt(i)!='.') q.add(i);
        }
        char ch[]=new char[n];
        Arrays.fill(ch,'.');
        while(!q.isEmpty()){
            int in=q.remove();
            if(dom.charAt(in)=='L'){
                ch[in]='L';
                in--;
                while(in>=0 && dom.charAt(in)=='.'){
                    ch[in]='L';
                    in--;
                }
            } else {
                if(q.isEmpty() || dom.charAt(q.peek())=='R'){
                    int j=q.isEmpty()?n-1:q.peek();
                    while(in<=j){
                        ch[in]='R';
                        in++;
                    }
                } else {
                    int j=q.remove();
                    while(in<j){
                        ch[in]='R';
                        ch[j]='L';
                        in++;
                        j--;
                    }
                }
            }
        }
        return new String(ch);
    }
}