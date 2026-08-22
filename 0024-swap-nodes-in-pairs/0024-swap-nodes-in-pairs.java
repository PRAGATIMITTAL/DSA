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
    public ListNode swapPairs(ListNode head) {
        if (head==null || head.next==null) return head;
        ListNode first = head;
        ListNode second = head.next;
        first.next=second.next;
        second.next=first;
        head=second;
        ListNode prev= first;
        while(prev.next!=null && prev.next.next!=null){
            first=prev.next;
            second = first.next;
            first.next=second.next;
            second.next=first;
            prev.next=second;
            prev=first;
        }
        return head;
    }
}