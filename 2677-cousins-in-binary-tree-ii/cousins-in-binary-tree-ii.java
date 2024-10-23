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
    public TreeNode replaceValueInTree(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        Queue<Integer> val=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int s=q.size(), sum=0;
            while(s>0){
                TreeNode t=q.poll();
                sum+=t.val;
                if(t.left!=null) q.add(t.left);
                if(t.right!=null) q.add(t.right);
                s--;
            }
            val.add(sum);
        }
        val.remove();
        root.val=0;
        q.add(root);
        while(!val.isEmpty()){
            int s=q.size(), sum=val.poll();
            while(s>0){
                TreeNode t=q.poll();
                int temp=sum;
                if(t.left!=null){
                    q.add(t.left);
                    temp-=t.left.val;
                }
                if(t.right!=null){
                    q.add(t.right);
                    temp-=t.right.val;
                }
                if(t.left!=null) t.left.val=temp;
                if(t.right!=null) t.right.val=temp; 
                s--;
            }
        }
        return root;
    }
}