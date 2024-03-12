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
    public ListNode removeZeroSumSublists(ListNode head) {
        Map<Integer,ListNode> map=new HashMap<>();
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        head=dummy;
        int prefixsum=0;
        while(dummy!=null){
            prefixsum+=dummy.val;
            if(map.containsKey(prefixsum)){
                ListNode temp=map.get(prefixsum);
                ListNode next=temp.next;
                temp.next=dummy.next;
                int sum=prefixsum;
                while(next!=dummy){
                    sum+=next.val;
                    map.remove(sum);
                    next=next.next;
                }
            } else map.put(prefixsum,dummy);
            dummy=dummy.next;
        }
        return head.next;
    }
}