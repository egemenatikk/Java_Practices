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
        if (head == null || head.next == null) return head;

        ListNode newHead;
        ListNode iterator = head;
        Stack<ListNode> stack = new Stack<>();

        while (head.next != null) {
            stack.add(head);
            head = head.next;
        }

        newHead = head;
        iterator = head;

        while (!stack.isEmpty()) {
            ListNode current = stack.pop();
            current.next = null;
            iterator.next = current;
            iterator = iterator.next;
        }

        return newHead;

    }
}