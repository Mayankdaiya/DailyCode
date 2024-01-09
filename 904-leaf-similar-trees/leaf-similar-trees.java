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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        String str1=getLeafNodeSequence(root1);
        String str2=getLeafNodeSequence(root2);
        return str1.equals(str2);
    }
    public static String getLeafNodeSequence(TreeNode root){
        if(root.right==null && root.left==null){
            return "-"+root.val;
        } else if(root.right==null){
            return ""+getLeafNodeSequence(root.left);
        } else if(root.left==null){
            return ""+getLeafNodeSequence(root.right);
        }
        StringBuilder str=new StringBuilder();
        str.append(getLeafNodeSequence(root.left));
        str.append(getLeafNodeSequence(root.right));
        return str.toString();
    }
}