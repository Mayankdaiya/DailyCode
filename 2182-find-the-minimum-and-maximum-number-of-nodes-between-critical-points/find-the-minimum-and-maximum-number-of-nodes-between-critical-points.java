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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if(head.next.next==null) return new int[]{-1,-1};
        ListNode cur=head.next;
        int in=-1, c=1, pre=-1, min=100001, max=-1;
        while(cur.next!=null){
            if((cur.val>head.val && cur.val>cur.next.val) || (cur.val<head.val && cur.val<cur.next.val)){
                if(in==-1) in=c;
                if(pre!=-1) min=Math.min(min,c-pre);
                pre=c;
                max=Math.max(max,c-in);
            }
            c++;
            cur=cur.next;
            head=head.next;
        }
        if(min==100001) min=-1;
        if(max==0) max=-1;
        return new int[]{min,max};
    }
}