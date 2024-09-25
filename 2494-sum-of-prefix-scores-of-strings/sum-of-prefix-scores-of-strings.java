public class Trie {
    
    public class Node{
        int c;
        Map<Character,Node> map=new HashMap<>();
    }
    
    private Node root;

    public Trie(){
        Node nn=new Node();
        this.root=nn;    
    }

    public void insert(String str){
        Node curr=root;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(curr.map.containsKey(ch)){
                curr.map.get(ch).c++;
                curr=curr.map.get(ch);
            } else {
                Node nn=new Node();
                nn.c=1;
                curr.map.put(ch,nn);
                curr=nn;
            }
        }
    }

    public int countPrefix(String str){
        Node curr=root;
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            count+=curr.map.get(ch).c;
            curr=curr.map.get(ch);
        }
        return count;
    }
}
class Solution {
    public int[] sumPrefixScores(String[] words) {
        Trie t=new Trie();
        for(int i=0;i<words.length;i++){
            t.insert(words[i]);
        }
        int res[]=new int[words.length];
        for(int i=0;i<words.length;i++){
            res[i]=t.countPrefix(words[i]);
        }
        return res;
    }
}