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
    public TreeNode createBinaryTree(int[][] descriptions) {
        Set<Integer> set=new HashSet<>();
        Map<Integer,TreeNode> map=new HashMap<>();
        for(int i=0;i<descriptions.length;i++){
            int parent=descriptions[i][0], child=descriptions[i][1], left=descriptions[i][2];
            if(map.containsKey(parent)){
                if(left==1){
                    if(map.containsKey(child)) map.get(parent).left=map.get(child);
                    else {
                        map.get(parent).left=new TreeNode(child);
                        map.put(child,map.get(parent).left);
                    }
                } else {
                    if(map.containsKey(child)) map.get(parent).right=map.get(child);
                    else {
                        map.get(parent).right=new TreeNode(child);
                        map.put(child,map.get(parent).right);
                    }
                } 
                set.add(child);    
            } else if(map.containsKey(child)){
                TreeNode temp=new TreeNode(parent);
                map.put(parent,temp);
                if(left==1) temp.left=map.get(child);
                else temp.right=map.get(child);
                set.add(child);
            } else {
                TreeNode temp=new TreeNode(parent);
                map.put(parent,temp);
                if(left==1){
                    temp.left=new TreeNode(child);
                    map.put(child,temp.left);
                } 
                else {
                    temp.right=new TreeNode(child);
                    map.put(child,temp.right);
                } 
                set.add(child);
            }
        }
        for(int i=0;i<descriptions.length;i++){
            if(!set.contains(descriptions[i][0])) return map.get(descriptions[i][0]);
            if(!set.contains(descriptions[i][1])) return map.get(descriptions[i][1]);
        }
        return null;
    }
}