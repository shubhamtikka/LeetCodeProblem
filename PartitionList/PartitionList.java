package PartitionList;
public class PartitionList {
    public ListNode partition(ListNode head, int x) {
        if (head == null)
            return head;
        ListNode dummyStart = new ListNode(-1);
        ListNode dummyEnd = new ListNode(-1);

        ListNode start = dummyStart, end = dummyEnd;
        ListNode curr = head;

        while (curr != null) {
            if (curr.val < x) {
                start.next = curr;
                start = start.next;
            } else {
                end.next = curr;
                end = end.next;
            }
            curr = curr.next;
        }
        end.next = null;
        start.next = dummyEnd.next;
        return dummyStart.next;
    }
}

