package MinimumDepthofBinaryTree;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MinimumDepthOfBinaryTreeTest {

    @Test
    public void testMinimumDepthExample1() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        MinimumDepthofBinaryTree solution = new MinimumDepthofBinaryTree();
        assertEquals(2, solution.minDepth(root));
    }

    @Test
    public void testMinimumDepthExample2() {
        TreeNode root = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(5);
        root.right.right.right.right = new TreeNode(6);

        MinimumDepthofBinaryTree solution = new MinimumDepthofBinaryTree();
        assertEquals(5, solution.minDepth(root));
    }
}
