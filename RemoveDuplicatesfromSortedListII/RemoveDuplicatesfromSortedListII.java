package RemoveDuplicatesfromSortedListII;

public class RemoveDuplicatesfromSortedListII {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode curr = dummy;

        while (curr.next != null && curr.next.next != null) {
            if (curr.next.val == curr.next.next.val) {
                int dup = curr.next.val;
                ListNode temp = curr.next;
                while (temp != null && temp.val == dup) {
                    curr.next = temp.next;
                    temp = temp.next;
                }
            } else {
                curr = curr.next;
            }

        }
        return dummy.next;
    }
}
