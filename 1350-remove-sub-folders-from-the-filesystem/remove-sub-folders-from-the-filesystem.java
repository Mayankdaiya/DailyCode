class Solution {
    public class Trie{
        public class Node{
            String str;
            Map<String,Node> map=new HashMap<>();
            boolean isTerminal=false;
        }
        public Node root;
        public Trie(){
            Node nn=new Node();
            nn.str="";
            this.root=nn;
        }
        public void insert(String word){
            String arr[]=word.split("/");
            Node curr=root;
            for(int i=0;i<arr.length;i++){
                if(arr[i].isEmpty()) continue;
                if(curr.map.containsKey(arr[i])){
                    curr=curr.map.get(arr[i]);
                } else {
                    Node nn=new Node();
                    nn.str=arr[i];
                    curr.map.put(arr[i],nn);
                    curr=nn;
                }
            }
            curr.isTerminal=true;
        }
        public List<String> getFolders(Node curr,StringBuilder str){
            if(curr.isTerminal){
                return new ArrayList<>(Arrays.asList(str.toString()));
            }
            List<String> res=new ArrayList<>();
            for(String child:curr.map.keySet()){
                str.append("/"); str.append(child);
                res.addAll(getFolders(curr.map.get(child),str));
                str.delete(str.length()-child.length()-1,str.length());
            }
            return res;
        }
    }
    public List<String> removeSubfolders(String[] folder) {
        Trie t=new Trie();
        for(int i=0;i<folder.length;i++){
            t.insert(folder[i]);
        }
        return t.getFolders(t.root,new StringBuilder());
    }
}