package BinaryTreeLevelOrderTraversal;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeLevelOrderTraversalTests {

    @Test
    public void testExample1() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        BinaryTreeLevelOrderTraversal solution = new BinaryTreeLevelOrderTraversal();
        List<List<Integer>> result = solution.levelOrder(root);

        List<List<Integer>> expected = new ArrayList<>();
        expected.add(List.of(3));
        expected.add(List.of(9, 20));
        expected.add(List.of(15, 7));

        assertEquals(expected, result);
    }

    @Test
    public void testExample2() {
        TreeNode root = new TreeNode(1);

        BinaryTreeLevelOrderTraversal solution = new BinaryTreeLevelOrderTraversal();
        List<List<Integer>> result = solution.levelOrder(root);

        List<List<Integer>> expected = new ArrayList<>();
        expected.add(List.of(1));

        assertEquals(expected, result);
    }

    @Test
    public void testExample3() {
        TreeNode root = null;

        BinaryTreeLevelOrderTraversal solution = new BinaryTreeLevelOrderTraversal();
        List<List<Integer>> result = solution.levelOrder(root);

        List<List<Integer>> expected = new ArrayList<>();

        assertEquals(expected, result);
    }
}
