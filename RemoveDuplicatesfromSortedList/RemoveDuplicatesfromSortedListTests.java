package RemoveDuplicatesfromSortedList;

import org.junit.Test;
import static org.junit.Assert.*;

public class RemoveDuplicatesfromSortedListTests {

    // Helper method to create a linked list from an array
    private ListNode createList(int[] values) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        for (int val : values) {
            current.next = new ListNode(val);
            current = current.next;
        }

        return dummy.next;
    }

    // Helper method to convert a linked list to an array
    private int[] listToArray(ListNode head) {
        int length = 0;
        ListNode current = head;
        while (current != null) {
            length++;
            current = current.next;
        }

        int[] result = new int[length];
        current = head;
        int i = 0;
        while (current != null) {
            result[i++] = current.val;
            current = current.next;
        }

        return result;
    }

    @Test
    public void testExample1() {
        int[] input = { 1, 1, 2 };
        int[] expected = { 1, 2 };

        ListNode head = createList(input);
        RemoveDuplicatesfromSortedList solution = new RemoveDuplicatesfromSortedList();
        ListNode result = solution.deleteDuplicates(head);

        assertArrayEquals(expected, listToArray(result));
    }

    @Test
    public void testExample2() {
        int[] input = { 1, 1, 2, 3, 3 };
        int[] expected = { 1, 2, 3 };

        ListNode head = createList(input);
        RemoveDuplicatesfromSortedList solution = new RemoveDuplicatesfromSortedList();
        ListNode result = solution.deleteDuplicates(head);

        assertArrayEquals(expected, listToArray(result));
    }

    @Test
    public void testNoDuplicates() {
        int[] input = { 1, 2, 3, 4, 5 };
        int[] expected = { 1, 2, 3, 4, 5 };

        ListNode head = createList(input);
        RemoveDuplicatesfromSortedList solution = new RemoveDuplicatesfromSortedList();
        ListNode result = solution.deleteDuplicates(head);

        assertArrayEquals(expected, listToArray(result));
    }

    @Test
    public void testAllDuplicates() {
        int[] input = { 1, 1, 1, 1, 1 };
        int[] expected = { 1 };

        ListNode head = createList(input);
        RemoveDuplicatesfromSortedList solution = new RemoveDuplicatesfromSortedList();
        ListNode result = solution.deleteDuplicates(head);

        assertArrayEquals(expected, listToArray(result));
    }
}
