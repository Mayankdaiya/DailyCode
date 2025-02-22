/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    static int i=0;
    public TreeNode recoverFromPreorder(String traversal) {
        i=0;
        return recover(traversal,0);
    }
    public static TreeNode recover(String str,int dep){
        if(i>=str.length()) return null;
        int d=0;
        while(str.charAt(i)=='-'){
            d++; i++;
        }
        if(d<dep){
            i-=d;
            return null;
        }
        int x=0;
        while(i<str.length() && str.charAt(i)!='-'){
            x=x*10+str.charAt(i)-'0';
            i++;
        }
        TreeNode root=new TreeNode(x);
        root.left=recover(str,dep+1);
        root.right=recover(str,dep+1);
        return root;
    }
}