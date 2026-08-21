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
    public void reorderList(ListNode head) {
         ListNode current = head;
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode anotherHalf = slow.next;
        slow.next = null;
        ListNode previous = null;
        ListNode current2 = anotherHalf;

        while (current2 != null) {
            ListNode next = current2.next;
            current2.next = previous;
            previous = current2;
            current2 = next;
        }

         current2 = previous;

        ListNode current1 = head;

        while (current2 != null) {

            ListNode next = current1.next;
            ListNode next2 = current2.next;

            current1.next = current2;
            current2.next = next;

            current1 = next;
            current2 = next2;
        }
    }
}
