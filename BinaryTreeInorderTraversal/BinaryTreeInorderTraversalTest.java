package BinaryTreeInorderTraversal;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class BinaryTreeInorderTraversalTest {

    BinaryTreeInorderTraversal obj = new BinaryTreeInorderTraversal();

    @Test
    public void testInorderTraversal() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        List<Integer> expectedList = Arrays.asList(1, 3, 2);
        List<Integer> actualList = obj.inorderTraversal(root);

        assertEquals(expectedList, actualList);
    }
}