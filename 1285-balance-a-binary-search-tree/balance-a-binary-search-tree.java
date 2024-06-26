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
    public static void getInorder(TreeNode root,List<Integer> inorder){
        if(root==null) return;
        getInorder(root.left,inorder);
        inorder.add(root.val);
        getInorder(root.right,inorder);
    }
    public static TreeNode getBalancedBST(List<Integer> inorder,int l, int h){
        if(l>h) return null;
        int mid=l+(h-l)/2;
        TreeNode tree=new TreeNode(inorder.get(mid));
        tree.left=getBalancedBST(inorder,l,mid-1);
        tree.right=getBalancedBST(inorder,mid+1,h);
        return tree;
    }
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> inorder=new ArrayList<>();
        getInorder(root,inorder);
        return getBalancedBST(inorder,0,inorder.size()-1);
    }
}