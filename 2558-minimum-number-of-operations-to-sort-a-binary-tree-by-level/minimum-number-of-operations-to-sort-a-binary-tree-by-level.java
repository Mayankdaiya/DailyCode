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
    public int minimumOperations(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int minSwaps=0;
        while(!q.isEmpty()){
            int s=q.size();
            int arr[]=new int[s];
            List<int[]> list=new ArrayList<>();
            for(int i=0;i<s;i++){
                TreeNode t=q.poll();
                arr[i]=t.val;
                list.add(new int[]{arr[i],i});
                if(t.left!=null) q.add(t.left);
                if(t.right!=null) q.add(t.right);
            }
            int target[]=arr.clone();
            Map<Integer,Integer> map=new HashMap<>();
            Arrays.sort(target);
            for(int i=0;i<s;i++) map.put(arr[i],i);
            for(int i=0;i<s;i++){
                if(arr[i]!=target[i]){
                    minSwaps++;
                    int curr=map.get(target[i]);
                    map.put(arr[i],curr);
                    arr[curr]=arr[i];
                }
            }
        }
        return minSwaps;
    }
}
