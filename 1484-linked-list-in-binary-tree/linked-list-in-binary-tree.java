/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public boolean isSubPath(ListNode head, TreeNode root) {
        if(root==null) return false;
        boolean res=false;
        if(root.val==head.val){
            res=check(head.next,root);
            if(res) return res;
        }
        res=res||isSubPath(head,root.left);
        res=res||isSubPath(head,root.right);
        return res;
    }
    public static boolean check(ListNode head,TreeNode root){
        if(head==null) return true;
        boolean res=false;
        if(root.left!=null && root.left.val==head.val) res=res||check(head.next,root.left);
        if(root.right!=null && root.right.val==head.val) res=res||check(head.next,root.right);
        return res;
    }
}