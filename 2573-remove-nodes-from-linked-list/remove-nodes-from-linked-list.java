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
    public ListNode removeNodes(ListNode head) {
        ListNode pre=null;
        while(head!=null){
            ListNode next=head.next;
            head.next=pre;
            pre=head;
            head=next;
        }
        head=null;
        int max=0;
        while(pre!=null && pre.next!=null){
            max=Math.max(max,pre.val);
            ListNode temp=pre.next;
            while(temp!=null && temp.val<max){
                max=Math.max(max,temp.val);
                temp=temp.next;
            }
            pre.next=temp;
            ListNode next=pre.next;
            pre.next=head;
            head=pre;
            pre=next;
        }
        if(pre!=null && pre.val>=max){ 
            pre.next=head;
            head=pre;
        }
        return head;
    }
}