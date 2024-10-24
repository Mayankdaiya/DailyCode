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
    public class Pair{
        TreeNode t1, t2;
        public Pair(TreeNode t1,TreeNode t2){
            this.t1=t1;
            this.t2=t2;
        }
    }
    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        if(root1==null && root2==null) return true;
        else if(root1==null || root2==null) return false;
        if(root1.val!=root2.val) return false;
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(root1,root2));
        while(!q.isEmpty()){
            Pair p=q.poll();
            TreeNode t1=p.t1, t2=p.t2;
            int op=isPossible(t1,t2);
            if(op==-1) return false;
            else if(op==2){
                TreeNode temp=t1.left;
                t1.left=t1.right;
                t1.right=temp;
            }
            if(t1.left!=null) q.add(new Pair(t1.left,t2.left));
            if(t2.right!=null) q.add(new Pair(t1.right,t2.right));
        }
        return true;
    }
    public static int isPossible(TreeNode t1,TreeNode t2){
        if(t1.left!=null && t1.right!=null){
            if(t2.left!=null && t2.right!=null){
                if(t1.left.val==t2.left.val && t1.right.val==t2.right.val) return 1;
                else if(t1.left.val==t2.right.val && t1.right.val==t2.left.val) return 2;
                else return -1;
            } else return -1;
        } else if(t1.left!=null || t1.right!=null){
            if(t2.left==null && t2.right==null) return -1; 
            if(t2.left!=null && t2.right!=null) return -1;
            if(t1.left==null){
                if(t2.left==null && t1.right.val==t2.right.val) return 1;
                else if(t2.right==null && t1.right.val==t2.left.val) return 2;
                else return -1;
            } else {
                if(t2.left==null && t1.left.val==t2.right.val) return 2;
                else if(t2.right==null && t1.left.val==t2.left.val) return 1;
                else return -1;
            }
        } else if(t2.left!=null || t2.right!=null) return -1;
        return 1;
    }
}