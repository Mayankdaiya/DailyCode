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
    public TreeNode constructFromPrePost(int[] pre, int[] post) {
        int n=pre.length;
        return getTree(pre,post,0,n-1,0);
    }
    public static TreeNode getTree(int pre[],int post[],int st,int en,int ps){
        if(st>en) return null;
        if(st==en){
            return new TreeNode(pre[st]);
        }
        int left=pre[st+1];
        int n=1;
        while(post[ps+n-1]!=left){
            n++;
        }
        TreeNode root=new TreeNode(pre[st]);
        root.left=getTree(pre,post,st+1,st+n,ps);
        root.right=getTree(pre,post,st+n+1,en,ps+n);
        return root;
    }
}