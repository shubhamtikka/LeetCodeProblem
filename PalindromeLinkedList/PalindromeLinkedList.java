package PalindromeLinkedList;

import java.util.Stack;

public class PalindromeLinkedList {

    public boolean isPalindrome(ListNode head) {

        Stack<ListNode> stack = new Stack<>();

        ListNode temp1 = head;
        ListNode temp2 = head;

        while (temp1 != null) {
            stack.push(temp1);
            temp1 = temp1.next;
        }

        while (!stack.isEmpty()) {
            if (stack.pop().val != temp2.val) {
                return false;
            }
            temp2 = temp2.next;
        }
        return true;

    }
}
