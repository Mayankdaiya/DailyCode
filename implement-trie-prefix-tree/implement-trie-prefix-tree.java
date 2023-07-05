class Trie {

    public class Node{
        char ch;
        HashMap<Character,Node> map=new HashMap<>();
        boolean isTerminal=false;
    }
    private Node root;

    public Trie(){
        Node nn=new Node();
        nn.ch='*';
        this.root=nn;
    }
    
    public void insert(String str){
        Node curr=root;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(curr.map.containsKey(ch)){
                curr=curr.map.get(ch);
            } else{
                Node nn=new Node();
                nn.ch=ch;
                curr.map.put(ch,nn);
                curr=nn;
            }
            if(i==str.length()-1) curr.isTerminal=true;
         }
    }

    public boolean search(String str){
        Node curr=root;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(curr.map.containsKey(ch)){
                curr=curr.map.get(ch);
            }
            else return false;
        }
        return curr.isTerminal;
    }

    public boolean startsWith(String str){
        Node curr=root;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(!curr.map.containsKey(ch)){
                return false;
            }
            curr=curr.map.get(ch);
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */