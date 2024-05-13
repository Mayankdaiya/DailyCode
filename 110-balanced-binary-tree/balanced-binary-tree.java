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
    static boolean f=true;
    public boolean isBalanced(TreeNode root) {
        f=true;
        check(root);
        return f;
    }
    public static int check(TreeNode node){
        if(node==null) return 0;
        int left=check(node.left);
        int right=check(node.right);
        if(Math.abs(left-right)>1) f=false;
        return Math.max(left,right)+1;
    }
}