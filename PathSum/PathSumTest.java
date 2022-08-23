package PathSum;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PathSumTest {

    PathSum obj = new PathSum();

    @Test
    public void testhasPathSum() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right = new TreeNode(8);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(1);

        assertTrue(obj.hasPathSum(root, 22));
        assertTrue(obj.hasPathSum(root, 27));
        assertFalse(obj.hasPathSum(root, 50));

    }

}
