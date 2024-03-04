/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lengthA = 0;
        int lengthB = 0;

        ListNode tempA = headA;
        ListNode tempB = headB;

        while (tempA != null) {
            lengthA++;
            tempA = tempA.next;
        }

        while (tempB != null) {
            lengthB++;
            tempB = tempB.next;
        }

        int lengthDif = Math.abs(lengthA - lengthB);
        if (lengthA > lengthB) {
            while (lengthDif > 0) {
                headA = headA.next;
                lengthDif--;
            }
        } else {
            while (lengthDif > 0) {
                headB = headB.next;
                lengthDif--;
            }
        }

        while (headA != null && headB != null) {
            if (headA == headB) return headB;
            headA = headA.next;
            headB = headB.next;
        }

        return null;
    }
}