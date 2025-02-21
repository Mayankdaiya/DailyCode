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
class FindElements {
    TreeNode tree;
    public FindElements(TreeNode root) {
        tree=root;
        root.val=0;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode t=q.poll();
            if(t.left!=null){
                t.left.val=t.val*2+1;
                q.add(t.left);
            } 
            if(t.right!=null){
                t.right.val=t.val*2+2;
                q.add(t.right);
            } 
        }
    }
    
    public boolean find(int target) {
        return contains(tree,target);
    }
    public boolean contains(TreeNode tree,int target){
        if(tree==null) return false;
        return tree.val==target || contains(tree.left,target) || contains(tree.right,target);
    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */