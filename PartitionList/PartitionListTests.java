package PartitionList;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class PartitionListTests {

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
        int[] input = { 1, 4, 3, 2, 5, 2 };
        int x = 3;
        int[] expected = { 1, 2, 2, 4, 3, 5 };

        ListNode head = createList(input);
        PartitionList solution = new PartitionList();
        ListNode result = solution.partition(head, x);

        int[] resultArray = listToArray(result);
        assertArrayEquals(expected, resultArray);
    }

    @Test
    public void testExample2() {
        int[] input = { 2, 1 };
        int x = 2;
        int[] expected = { 1, 2 };

        ListNode head = createList(input);
        PartitionList solution = new PartitionList();
        ListNode result = solution.partition(head, x);

        int[] resultArray = listToArray(result);
        assertArrayEquals(expected, resultArray);
    }

    @Test
    public void testEmptyList() {
        int[] input = {};
        int x = 3;
        int[] expected = {};

        ListNode head = createList(input);
        PartitionList solution = new PartitionList();
        ListNode result = solution.partition(head, x);

        int[] resultArray = listToArray(result);
        assertArrayEquals(expected, resultArray);
    }
}
