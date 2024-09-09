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
class Solution {
    public int[][] spiralMatrix(int n, int m, ListNode head) {
        int res[][]=new int[n][m];
        for(int i=0;i<n;i++) Arrays.fill(res[i],-1);
        int r1=0, r2=n-1, c1=0, c2=m-1;
        while(head!=null){
            int j=c1;
            while(head!=null && j<=c2){
                res[r1][j]=head.val;
                head=head.next; j++; 
            }
            int i=r1+1;
            while(head!=null && i<=r2){
                res[i][c2]=head.val;
                head=head.next; i++; 
            }
            j=c2-1;
            while(head!=null && j>=c1){
                res[r2][j]=head.val;
                head=head.next; j--; 
            }
            i=r2-1;
            while(head!=null && i>r1){
                res[i][c1]=head.val;
                head=head.next; i--;
            }
            c1++; c2--; r1++; r2--;
        }
        return res;
    }
}