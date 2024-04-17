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
    static String res;
    public String smallestFromLeaf(TreeNode root) {
        res="";
        solve(root,new String());
        return res;
    }

    public static void solve(TreeNode root,String str){
        if(root==null){
            return;
        } else if(root.left==null && root.right==null){
            str=(char)(root.val+'a')+str;
            if(check(str)) res=str;
            return;
        }
        if(root.left!=null){ 
            solve(root.left,((char)(root.val+'a'))+str);
        }
        if(root.right!=null){
            solve(root.right,((char)(root.val+'a'))+str);
        }
        return;
    }

    public static boolean check(String str){
        if(res.isEmpty()) return true;
        int i=0;
        while(i<str.length() && i<res.length()){
            if(str.charAt(i)<res.charAt(i)) return true;
            else if(str.charAt(i)>res.charAt(i)) return false;
            i++;
        }
        return str.length()<res.length();
    }
}