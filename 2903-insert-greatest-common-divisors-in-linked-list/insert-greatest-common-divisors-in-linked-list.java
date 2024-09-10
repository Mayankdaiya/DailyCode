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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode prev=head, cur=head.next;
        while(cur!=null){
            int d=gcd(Math.min(prev.val,cur.val),Math.max(prev.val,cur.val));
            prev.next=new ListNode(d);
            prev.next.next=cur;
            prev=cur;
            cur=cur.next;
        }
        return head;
    }
    public static int gcd(int n,int m){
        if(n==1 || m==1) return 1;
        while(m!=0){
            int rem=n%m;
            n=m;
            m=rem;
        }
        return n;
    }
}