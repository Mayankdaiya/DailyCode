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
    Map<String,TreeNode> map=new HashMap<>();
    Set<TreeNode> set=new HashSet<>();
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        duplicateString(root);
        return new ArrayList<>(set);
    }
    public String duplicateString(TreeNode root){
        if(root==null){
            return "x";
        }
        String left=duplicateString(root.left);
        String right=duplicateString(root.right);
        String str=root.val+" "+left+" "+right;
        if(map.containsKey(str)){
            set.add(map.get(str));
        } else{
            map.put(str,root);
        }
        return str;
    }
}