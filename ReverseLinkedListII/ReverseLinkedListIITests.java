package ReverseLinkedListII;

import org.junit.Test;
import static org.junit.Assert.*;

public class ReverseLinkedListIITests {

    @Test
    public void testExample1() {
        ReverseLinkedListII listReverser = new ReverseLinkedListII();

        // Create the original linked list
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        // Reverse the portion from position 2 to 4
        ListNode expected = listReverser.reverseBetween(head, 2, 4);

        // Validate the reversed list
        int[] expectedValues = { 1, 4, 3, 2, 5 };
        int index = 0;
        while (expected != null) {
            System.out.println(expected.val);
            assertEquals(expectedValues[index], expected.val);
            expected = expected.next;
            index++;
        }
    }

    @Test
    public void testExample3() {
        ReverseLinkedListII listReverser = new ReverseLinkedListII();

        // Create the original linked list
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        // Reverse the portion from position 2 to 4
        ListNode expected = listReverser.reverseBetween(head, 1, 3);

        // Validate the reversed list
        int[] expectedValues = { 3, 2, 1, 4, 5 };
        int index = 0;
        while (expected != null) {
            System.out.println(expected.val);
            assertEquals(expectedValues[index], expected.val);
            expected = expected.next;
            index++;
        }
    }

    @Test
    public void testExample4() {
        ReverseLinkedListII listReverser = new ReverseLinkedListII();

        // Create the original linked list
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        // Reverse the portion from position 2 to 4
        ListNode expected = listReverser.reverseBetween(head, 4, 5);

        // Validate the reversed list
        int[] expectedValues = { 1, 2, 3, 5, 4 };
        int index = 0;
        while (expected != null) {
            System.out.println(expected.val);
            assertEquals(expectedValues[index], expected.val);
            expected = expected.next;
            index++;
        }
    }

    @Test
    public void testExample5() {
        ReverseLinkedListII listReverser = new ReverseLinkedListII();

        // Create the original linked list
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        // Reverse the portion from position 2 to 4
        ListNode expected = listReverser.reverseBetween(head, 1, 5);

        // Validate the reversed list
        int[] expectedValues = { 5, 4, 3, 2, 1 };
        int index = 0;
        while (expected != null) {
            System.out.println(expected.val);
            assertEquals(expectedValues[index], expected.val);
            expected = expected.next;
            index++;
        }
    }

    @Test
    public void testExample2() {
        ReverseLinkedListII listReverser = new ReverseLinkedListII();

        // Create the original linked list
        ListNode head = new ListNode(5);

        // Reverse a single-node list (no change)
        ListNode expected = listReverser.reverseBetween(head, 1, 1);

        // Validate the reversed list
        assertEquals(5, expected.val);
        assertNull(expected.next);
    }

    @Test
    public void testSingleElementRange() {
        ReverseLinkedListII listReverser = new ReverseLinkedListII();

        // Create the original linked list
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        // Reverse a single element range (no change)
        ListNode expected = listReverser.reverseBetween(head, 3, 3);

        // Validate the reversed list
        int[] expectedValues = { 1, 2, 3, 4, 5 };
        int index = 0;
        while (expected != null) {
            assertEquals(expectedValues[index], expected.val);
            expected = expected.next;
            index++;
        }
    }
}
