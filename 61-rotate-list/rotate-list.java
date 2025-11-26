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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null)
            return null;
        else if(head.next==null || k==0)
            return head;
        int len=0;
        ListNode tmp=head;
        while(tmp!=null){
            len++;
            tmp=tmp.next;
        }
        k=k%len;
        k=len-k;
        if(k==len)
            return head;
        ListNode tt=head;
        tmp=tt;
        while(k>1){
            tmp=tmp.next;
            k--;
        }
        ListNode t=tmp.next;
        tmp.next=null;
        ListNode h=t;
        while(h.next!=null){
           h=h.next; 
        }
        h.next=tt;
        return t;
    }
}