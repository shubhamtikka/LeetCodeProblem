package CopyListwithRandomPointer;

import java.util.HashMap;

public class CopyListwithRandomPointer {

    public Node copyRandomList(Node head) {
        if (head == null)
            return null;

        HashMap<Node, Node> map = new HashMap<>();
        map.put(null, null);

        Node tempNewHead = new Node(head.val);

        Node newHead = tempNewHead;

        Node tempHead = head;
        map.put(tempHead, tempNewHead);

        while (tempHead.next != null) {
            tempHead = tempHead.next;
            Node node = new Node(tempHead.val);
            tempNewHead.next = node;
            tempNewHead = tempNewHead.next;
            map.put(tempHead, tempNewHead);
        }

        tempNewHead = newHead;
        tempHead = head;

        while (tempHead != null) {
            tempNewHead.random = map.get(tempHead.random);
            tempHead = tempHead.next;
            tempNewHead = tempNewHead.next;
        }

        return newHead;
    }

}
