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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || left==right) return head;
        ListNode prev = null;
        ListNode curr=head;
        for(int i=1; i<left;i++){
            prev = curr;
            curr=curr.next;
        }
        ListNode before = prev;
        ListNode last=  curr;

        for(int i=0; i<right-left+1; i++){
            ListNode temp = curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        if (before==null) head=prev;
        else before.next=prev;
        last.next=curr;
        return head;
    }
}