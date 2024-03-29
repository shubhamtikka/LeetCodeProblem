package BinaryTreeLevelOrderTraversalII;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeLevelOrderTraversalIITests {

    @Test
    public void testExample1() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        BinaryTreeLevelOrderTraversalII solution = new BinaryTreeLevelOrderTraversalII();
        List<List<Integer>> result = solution.levelOrderBottom(root);

        List<List<Integer>> expected = new ArrayList<>();
        expected.add(List.of(15, 7));
        expected.add(List.of(9, 20));
        expected.add(List.of(3));

        assertEquals(expected, result);
    }

    @Test
    public void testExample2() {
        TreeNode root = new TreeNode(1);

        BinaryTreeLevelOrderTraversalII solution = new BinaryTreeLevelOrderTraversalII();
        List<List<Integer>> result = solution.levelOrderBottom(root);

        List<List<Integer>> expected = new ArrayList<>();
        expected.add(List.of(1));

        assertEquals(expected, result);
    }

    @Test
    public void testExample3() {
        TreeNode root = null;

        BinaryTreeLevelOrderTraversalII solution = new BinaryTreeLevelOrderTraversalII();
        List<List<Integer>> result = solution.levelOrderBottom(root);

        List<List<Integer>> expected = new ArrayList<>();

        assertEquals(expected, result);
    }
}
