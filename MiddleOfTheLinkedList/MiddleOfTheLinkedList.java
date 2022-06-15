/*
876. Middle of the Linked List
Given the head of a singly linked list, return the middle node of the linked list.

If there are two middle nodes, return the second middle node.
*/
package MiddleOfTheLinkedList;

public class MiddleOfTheLinkedList {
    public ListNode middleNode(ListNode head) {
        int countOfNodes = 0;
        ListNode temp = head;
        ListNode midNode = head;

        while (temp != null) {
            countOfNodes++;
            if (countOfNodes % 2 == 0) {
                midNode = midNode.next;
            }
            temp = temp.next;
        }
        return midNode;
    }
}
