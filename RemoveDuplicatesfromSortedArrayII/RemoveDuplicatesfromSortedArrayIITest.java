package RemoveDuplicatesfromSortedArrayII;

import org.junit.Test;

public class RemoveDuplicatesfromSortedArrayIITest {
    RemoveDuplicatesfromSortedArrayII obj = new RemoveDuplicatesfromSortedArrayII();

    @Test
    public void testremoveDuplicates1() {
        int[] actualNums = new int[] { 1, 1, 1, 2, 2, 3 };
        int[] expectedNums = new int[] { 1, 1, 2, 2, 3 };
        int k = obj.removeDuplicates(actualNums); // Calls your implementation
        assert k == expectedNums.length;
        for (int i = 0; i < k; i++) {
            assert actualNums[i] == expectedNums[i];
        }
    }

    @Test
    public void testremoveDuplicates2() {
        int[] actualNums = new int[] { 0, 0, 1, 1, 1, 1, 2, 3, 3 };
        int[] expectedNums = new int[] { 0, 0, 1, 1, 2, 3, 3 };
        int k = obj.removeDuplicates(actualNums); // Calls your implementation
        assert k == expectedNums.length;
        for (int i = 0; i < k; i++) {
            assert actualNums[i] == expectedNums[i];
        }
    }

    @Test
    public void testremoveDuplicates3() {
        int[] actualNums = new int[] { 0, 0, 0, 0, 0 };
        int[] expectedNums = new int[] { 0, 0 };
        int k = obj.removeDuplicates(actualNums); // Calls your implementation
        // System.out.println(k);
        // System.out.println(Arrays.toString(actualNums));
        assert k == expectedNums.length;
        for (int i = 0; i < k; i++) {
            assert actualNums[i] == expectedNums[i];
        }
    }

    @Test
    public void testremoveDuplicates4() {
        int[] actualNums = new int[] { 1, 1, 1 };
        int[] expectedNums = new int[] { 1, 1 };
        int k = obj.removeDuplicates(actualNums); // Calls your implementation
        // System.out.println(k);
        // System.out.println(Arrays.toString(actualNums));
        assert k == expectedNums.length;
        for (int i = 0; i < k; i++) {
            assert actualNums[i] == expectedNums[i];
        }
    }

    @Test
    public void testremoveDuplicates5() {
        int[] actualNums = new int[] { 1, 2, 2, 2 };
        int[] expectedNums = new int[] { 1, 2, 2 };
        int k = obj.removeDuplicates(actualNums); // Calls your implementation
        // System.out.println(k);
        // System.out.println(Arrays.toString(actualNums));
        assert k == expectedNums.length;
        for (int i = 0; i < k; i++) {
            assert actualNums[i] == expectedNums[i];
        }
    }

}
