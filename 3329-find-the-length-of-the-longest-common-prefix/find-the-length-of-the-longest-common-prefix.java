public class Trie{
    public class Node{
        char dig;
        Map<Character,Node> map=new HashMap<>();
        boolean isterminal=false;
    }

    private Node root;
    
    public Trie() {
		Node nn= new Node();
		nn.dig='0';
		this.root = nn;
	}

    public void insert(int num){
        Node curr=root;
        String str=Integer.toString(num);
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(curr.map.containsKey(ch)){
                curr=curr.map.get(ch);
            } else {
                Node nn=new Node();
                nn.dig=ch;
                curr.map.put(ch,nn);
                curr=nn;
            }
        }
        curr.isterminal=true;
    }

    public int search(int num){
        Node curr=root;
        String str=Integer.toString(num);
        int len=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(!curr.map.containsKey(ch)) return len;
            else curr=curr.map.get(ch);
            len++;
        }
        return len;
    }
}
class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        Trie t=new Trie();
        for(int i=0;i<arr1.length;i++){
            t.insert(arr1[i]);
        }
        int len=0;
        for(int i=0;i<arr2.length;i++){
            len=Math.max(len,t.search(arr2[i]));
        }
        return len;
    }
}