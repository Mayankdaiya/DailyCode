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
    public TreeNode reverseOddLevels(TreeNode root) {
        TreeNode res=root;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int f=0;
        while(!q.isEmpty()){
            int s=q.size();
            if(f==0){
                List<TreeNode> list=new ArrayList<>();
                while(s-->0){
                    TreeNode t=q.poll();
                    if(t.left==null) continue;
                    list.add(t.left); 
                    list.add(t.right);
                    q.add(t.left);
                    q.add(t.right);
                }
                int n=list.size();
                for(int i=0;i<n/2;i++){
                    int t=list.get(i).val;
                    list.get(i).val=list.get(n-i-1).val;
                    list.get(n-i-1).val=t;
                }
                f=1;
            } else {
                while(s-->0){
                    TreeNode t=q.poll();
                    if(t.left==null) continue;
                    q.add(t.left);
                    q.add(t.right);
                }
                f=0;
            }
        }
        return root;
    }
}