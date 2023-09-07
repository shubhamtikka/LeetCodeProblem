package ReverseLinkedListII;

public class ReverseLinkedListII {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode prevL = dummy;

        ListNode curr = dummy.next;

        int counter = 1;

        while (counter < left) {
            prevL = curr;
            curr = curr.next;
            counter++;
        }

        ListNode nextL = curr;
        ListNode prev = curr;
        curr = curr.next;
        ListNode next;
        counter++;

        while (counter <= right) {
            // System.out.println("curr :" + curr.val);
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            counter++;
        }

        nextL.next = curr;
        prevL.next = prev;

        return dummy.next;
    }
}