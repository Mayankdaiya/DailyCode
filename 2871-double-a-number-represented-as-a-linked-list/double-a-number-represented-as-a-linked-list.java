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
    public ListNode doubleIt(ListNode head) {
        ListNode dummy=null;
        while(head!=null){
            ListNode next=head.next;
            head.next=dummy;
            dummy=head;
            head=next;
        }
        int c=0;
        head=null;
        while(dummy!=null){
            int el=2*dummy.val+c;
            c=el/10;
            dummy.val=el%10;
            ListNode next=dummy.next;
            dummy.next=head;
            head=dummy;
            dummy=next;
        }
        if(c>0){
            ListNode t=new ListNode(c);
            t.next=head;
            head=t;
        }
        return head;
    }
}