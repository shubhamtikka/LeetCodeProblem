package DeleteNodeInBST;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class DeleteNodeInBSTTests {

    @Test
    public void testExample1() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(7);

        DeleteNodeInBST solution = new DeleteNodeInBST();
        TreeNode result = solution.deleteNode(root, 3);

        assertEquals(5, result.val);
        assertEquals(4, result.left.val);
        assertEquals(6, result.right.val);
        assertEquals(2, result.left.left.val);
        assertNull(result.left.right);
        assertEquals(7, result.right.right.val);
    }

    @Test
    public void testExample2() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(7);

        DeleteNodeInBST solution = new DeleteNodeInBST();
        TreeNode result = solution.deleteNode(root, 0);

        assertEquals(5, result.val);
        assertEquals(3, result.left.val);
        assertEquals(6, result.right.val);
        assertEquals(2, result.left.left.val);
        assertEquals(4, result.left.right.val);
        assertEquals(7, result.right.right.val);
    }

    @Test
    public void testExample3() {
        TreeNode root = null;

        DeleteNodeInBST solution = new DeleteNodeInBST();
        TreeNode result = solution.deleteNode(root, 0);

        assertNull(result);
    }
}
