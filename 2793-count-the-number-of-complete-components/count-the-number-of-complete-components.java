class Solution {
    public int countCompleteComponents(int n, int[][] edges) {
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new ArrayList<>());
        }
        for(int ed[]:edges){
            list.get(ed[0]).add(ed[1]);
            list.get(ed[1]).add(ed[0]);
        }
        int comp=0;
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            if(list.get(i).isEmpty()) comp++;
            else if(set.contains(i)) continue;
            else {
                Set<Integer> t=new HashSet<>();
                Queue<Integer> q=new LinkedList<>();
                t.add(i);
                for(int ed:list.get(i)){
                    t.add(ed);
                    q.add(ed);
                }
                int f=0;
                while(f!=1 && !q.isEmpty()){
                    int ed=q.poll();
                    if(set.contains(ed) || list.get(ed).size()+1!=t.size()){
                        f=1;
                        break;
                    }
                    for(int el:list.get(ed)){
                        if(!t.contains(el)){
                            f=1;
                            break;
                        }
                    }
                }
                if(f==0) comp++;
                set.addAll(t);
            }
        }
        return comp;
    }
}