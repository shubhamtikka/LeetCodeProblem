/*
 * 19. Remove Nth Node From End of List
 * Given the head of a linked list, remove the nth node from the end of the list and return its head.
 */

package RemoveNthNodeFromEndofList;

public class RemoveNthNodeFromEnd {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode temp = head;
        int countOfNodes = 0;
        ListNode nthNodeFromStart = head;

        while (temp != null) {
            countOfNodes++;
            temp = temp.next;
            if (countOfNodes <= n)
                continue;
            nthNodeFromStart = nthNodeFromStart.next;
        }

        if (countOfNodes == n) {
            return head.next;
        }

        nthNodeFromStart.next = nthNodeFromStart.next.next;

        return head;
    }

}
