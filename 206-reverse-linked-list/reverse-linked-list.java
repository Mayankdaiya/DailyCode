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
    
    public ListNode reverseList(ListNode head) {
       ListNode curr= head;
ListNode pre= head;
if(head==null)
{
return null;
}
if(head.next==null)
{
return head;
}
while(curr!=null)
{
ListNode next= curr.next;
curr.next=pre;
pre= curr;
curr=next;
}
head.next=null;
head=pre;

    return pre;
 
    }
}