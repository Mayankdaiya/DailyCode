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
    public long kthLargestLevelSum(TreeNode root, int k) {
        PriorityQueue<Long> pq=new PriorityQueue<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root); q.add(null);
        while(!q.isEmpty()){
            long sum=0;
            while(q.peek()!=null){
                TreeNode t=q.poll();
                sum+=t.val; 
                if(t.left!=null) q.add(t.left);
                if(t.right!=null) q.add(t.right);
            }
            q.remove();
            if(!q.isEmpty()) q.add(null);
            pq.add(sum);
            if(pq.size()>k) pq.poll();
        }
        return pq.size()<k?-1:pq.peek();
    }
}