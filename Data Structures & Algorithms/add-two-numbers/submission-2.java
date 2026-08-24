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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        int sum;

        ListNode dummy = new ListNode(0);
        ListNode head = dummy;

        while(l1 != null || l2 != null){

           int val1 = 0;
           int val2 = 0;

            if (l1 != null) {
                val1 = l1.val;
            }
            if(l2 != null) {
                val2 = l2.val;
            }
                sum = val1 + val2 + carry;
                if(sum >= 10){
                    dummy.next = new ListNode(sum % 10);
                    carry = sum /10;
                }
                else{
                    dummy.next = new ListNode(sum);
                    carry = 0;
                }

            if (l1 != null) {
                l1 = l1.next;
            }

            if (l2 != null) {
                l2 = l2.next;
            }
                dummy = dummy.next;
        }
            if(carry != 0){
                dummy.next = new ListNode(carry);
            }

        return head.next;
    }
}
