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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth==1){
            TreeNode res=new TreeNode(val);
            res.left=root;
            return res;
        }
        int cur=2;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root); q.add(null);
        while(cur!=depth){
            while(q.peek()!=null){
                TreeNode t=q.poll();
                if(t.left!=null) q.add(t.left);
                if(t.right!=null) q.add(t.right);
            }
            q.poll();
            q.add(null);
            cur++;
        }
        while(q.peek()!=null){
            TreeNode t=q.poll();
            TreeNode l=new TreeNode(val);
            TreeNode r=new TreeNode(val);
            l.left=t.left;
            r.right=t.right;
            t.left=l; t.right=r;
        }
        return root;
    }
}