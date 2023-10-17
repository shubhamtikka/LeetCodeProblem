package MaximumDepthOfBinaryTree;

import org.junit.Test;
import static org.junit.Assert.*;

public class MaximumDepthOfBinaryTreeTest {

    @Test
    public void testMaximumDepthOfEmptyTree() {
        TreeNode root = null;
        MaximumDepthOfBinaryTree solution = new MaximumDepthOfBinaryTree();
        int depth = solution.maxDepth(root);
        assertEquals(0, depth);
    }

    @Test
    public void testMaximumDepthOfSingleNodeTree() {
        TreeNode root = new TreeNode(5);
        MaximumDepthOfBinaryTree solution = new MaximumDepthOfBinaryTree();
        int depth = solution.maxDepth(root);
        assertEquals(1, depth);
    }

    @Test
    public void testMaximumDepthOfTreeWithMultipleLevels() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        MaximumDepthOfBinaryTree solution = new MaximumDepthOfBinaryTree();
        int depth = solution.maxDepth(root);
        assertEquals(3, depth);
    }

    @Test
    public void testMaximumDepthOfUnbalancedTree() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);

        MaximumDepthOfBinaryTree solution = new MaximumDepthOfBinaryTree();
        int depth = solution.maxDepth(root);
        assertEquals(3, depth);
    }
}
