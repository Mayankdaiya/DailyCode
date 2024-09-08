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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode res[]=new ListNode[k];
        int n=0;
        ListNode dummy=head;
        while(dummy!=null){
            n++;
            dummy=dummy.next;
        }
        int size=n/k, rem=n-size*k, f=0;
        if(rem>0) f=1;
        for(int i=0;i<k;i++){
            int t=1;
            ListNode ans=head;
            while(head!=null && t<(size+f)){
                head=head.next;
                t++;
            }
            ListNode temp=null;
            if(head!=null) temp=head.next;
            if(head!=null) head.next=null;
            head=temp;
            res[i]=ans;
            if(rem>0) rem--;
            if(rem==0) f=0;
        }
        return res;
    }
}