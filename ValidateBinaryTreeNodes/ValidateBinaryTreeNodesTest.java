package ValidateBinaryTreeNodes;

import org.junit.Test;
import static org.junit.Assert.*;

public class ValidateBinaryTreeNodesTest {

    @Test
    public void testValidTree() {
        int n = 4;
        int[] leftChild = { 1, -1, 3, -1 };
        int[] rightChild = { 2, -1, -1, -1 };
        ValidateBinaryTreeNodes solution = new ValidateBinaryTreeNodes();
        assertTrue(solution.validateBinaryTreeNodes(n, leftChild, rightChild));
    }

    @Test
    public void testInvalidTreeWithTwoRoots() {
        int n = 4;
        int[] leftChild = { 1, -1, 3, -1 };
        int[] rightChild = { 2, 3, -1, -1 };
        ValidateBinaryTreeNodes solution = new ValidateBinaryTreeNodes();
        assertFalse(solution.validateBinaryTreeNodes(n, leftChild, rightChild));
    }

    @Test
    public void testInvalidTreeWithCycle() {
        int n = 4;
        int[] leftChild = { 1, 2, 0, 3 };
        int[] rightChild = { -1, -1, -1, -1 };
        ValidateBinaryTreeNodes solution = new ValidateBinaryTreeNodes();
        assertFalse(solution.validateBinaryTreeNodes(n, leftChild, rightChild));
    }

}
