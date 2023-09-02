class Solution {
    public class Node{
        char ch;
        HashMap<Character,Node> map=new HashMap<>();
        int count=0;
    }
    private Node root;
    public Solution(){
        Node nn=new Node();
        nn.ch='*';
        this.root=nn;
    }
    public void insert(String str){
        Node curr=root;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(curr.map.containsKey(ch)){
                curr.count++;
                curr=curr.map.get(ch);
                // curr.count++;
            } else{
                Node nn=new Node();
                nn.ch=ch;
                curr.count=1;
                curr.map.put(ch,nn);
                curr=nn;
            }
         }
    }

    public String commonPrefix(String str,int len){
        Node curr=root;
        String t="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(curr.count==len) {
                t+=ch;
            } else return t;
            curr=curr.map.get(ch);
        }
        return t;
    }

    public String longestCommonPrefix(String[] strs) {
        Solution tr=new Solution();
        for(int i=0;i<strs.length;i++){
            tr.insert(strs[i]);
        }
        return tr.commonPrefix(strs[0],strs.length);
    }
}