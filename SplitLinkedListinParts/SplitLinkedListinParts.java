package SplitLinkedListinParts;

public class SplitLinkedListinParts {
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode res[] = new ListNode[k];

        ListNode tempIterator = head;
        int N = 0;
        // get lenngth of linked list
        while (tempIterator != null) {
            N++;
            tempIterator = tempIterator.next;
        }

        tempIterator = head;
        int size = N / k;
        int extra = N % k;

        for (int i = 0; i < k; i++) {
            res[i] = tempIterator;
            int currentSize = size + (extra-- > 0 ? 1 : 0);
            for (int j = 0; j < currentSize - 1; j++) {
                tempIterator = tempIterator.next;
            }
            if (tempIterator != null) {
                ListNode temp = tempIterator.next;
                tempIterator.next = null;
                tempIterator = temp;
            }
        }
        return res;
    }

}