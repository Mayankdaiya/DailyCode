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
    public boolean isEvenOddTree(TreeNode root) {
        if(root.val%2==0) return false;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int l=0;
        while(!q.isEmpty()){
            int in=q.size()-2;
            TreeNode temp=q.remove();
            if(temp.left!=null) q.add(temp.left);
            if(temp.right!=null) q.add(temp.right);
            if((l%2==0 && temp.val%2==0) || (l%2==1 && temp.val%2==1)) return false; 
            for(int i=in;i>=0;i--){
                TreeNode curr=q.remove();
                if(l%2==0){
                    if(curr.val%2==0 || curr.val<=temp.val) return false;
                } else{
                    if(curr.val%2==1 || curr.val>=temp.val) return false;
                }
                temp=curr;
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right); 
            }
            if(q.isEmpty()) {
                return true;
            }
            l++;
        }
        return true;
    }
}