package LinkedListCycle;

import org.junit.Test;
import static org.junit.Assert.*;

public class LinkedListCycleTests {

    @Test
    public void testNoCycle() {
        LinkedListCycle cycleChecker = new LinkedListCycle();

        // Create a linked list with no cycle
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        boolean expected = false;
        boolean result = cycleChecker.hasCycle(head);
        assertEquals(expected, result);
    }

    @Test
    public void testCycle() {
        LinkedListCycle cycleChecker = new LinkedListCycle();

        // Create a linked list with a cycle
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        head.next = node2;
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = node2; // This creates a cycle

        boolean expected = true;
        boolean result = cycleChecker.hasCycle(head);
        assertEquals(expected, result);
    }

    @Test
    public void testSingleNodeNoCycle() {
        LinkedListCycle cycleChecker = new LinkedListCycle();

        // Create a single-node linked list with no cycle
        ListNode head = new ListNode(1);

        boolean expected = false;
        boolean result = cycleChecker.hasCycle(head);
        assertEquals(expected, result);
    }

    @Test
    public void testSingleNodeWithCycle() {
        LinkedListCycle cycleChecker = new LinkedListCycle();

        // Create a single-node linked list with a cycle (pointing to itself)
        ListNode head = new ListNode(1);
        head.next = head;

        boolean expected = true;
        boolean result = cycleChecker.hasCycle(head);
        assertEquals(expected, result);
    }
}
