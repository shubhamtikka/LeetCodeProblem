package FindLargestValueInEachRow;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import java.util.List;

public class FindLargestValueInEachRowTests {
    @Test
    public void testExample1() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(3);
        root.right.right = new TreeNode(9);

        FindLargestValueInEachRow solution = new FindLargestValueInEachRow();
        List<Integer> result = solution.largestValues(root);

        List<Integer> expected = List.of(1, 3, 9);
        assertEquals(expected, result);
    }

    @Test
    public void testExample2() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        FindLargestValueInEachRow solution = new FindLargestValueInEachRow();
        List<Integer> result = solution.largestValues(root);

        List<Integer> expected = List.of(1, 3);
        assertEquals(expected, result);
    }

    @Test
    public void testEmptyTree() {
        TreeNode root = null;

        FindLargestValueInEachRow solution = new FindLargestValueInEachRow();
        List<Integer> result = solution.largestValues(root);

        List<Integer> expected = List.of();
        assertEquals(expected, result);
    }
}
