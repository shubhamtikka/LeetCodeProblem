package RemoveDuplicatesfromSortedList;

public class RemoveDuplicatesfromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null)
            return head;
        ListNode curr = head;

        while (curr.next != null) {
            int currVal = curr.val;
            // curr = curr.next;
            if (curr.next.val == currVal) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return head;
    }
}
