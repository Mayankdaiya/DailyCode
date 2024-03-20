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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode last=list2;
        while(last.next!=null){
            last=last.next;
        }
        b-=a;
        ListNode head=list1;
        while(list1!=null){
            a--;
            if(a==0){
                ListNode temp=list1.next;
                list1.next=list2; a=b;
                while(temp!=null){
                    if(a==0){
                        last.next=temp.next;
                        break;
                    }
                    a--; temp=temp.next;
                }
            }
            list1=list1.next;
        }
        return head;
    }
}