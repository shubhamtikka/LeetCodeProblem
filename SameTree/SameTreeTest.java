package SameTree;

import org.junit.Test;
import static org.junit.Assert.*;

public class SameTreeTest {

    @Test
    public void testExample1() {
        TreeNode p = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode q = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        SameTree solution = new SameTree();
        assertTrue(solution.isSameTree(p, q));
    }

    @Test
    public void testExample2() {
        TreeNode p = new TreeNode(1, new TreeNode(2), null);
        TreeNode q = new TreeNode(1, null, new TreeNode(2));
        SameTree solution = new SameTree();
        assertFalse(solution.isSameTree(p, q));
    }

    @Test
    public void testExample3() {
        TreeNode p = new TreeNode(1, new TreeNode(2), new TreeNode(1));
        TreeNode q = new TreeNode(1, new TreeNode(1), new TreeNode(2));
        SameTree solution = new SameTree();
        assertFalse(solution.isSameTree(p, q));
    }

    @Test
    public void testEmptyTrees() {
        TreeNode p = null;
        TreeNode q = null;
        SameTree solution = new SameTree();
        assertTrue(solution.isSameTree(p, q));
    }

    @Test
    public void testOneEmptyTree() {
        TreeNode p = new TreeNode(1);
        TreeNode q = null;
        SameTree solution = new SameTree();
        assertFalse(solution.isSameTree(p, q));
    }

    @Test
    public void testUnequalTrees() {
        TreeNode p = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode q = new TreeNode(1, new TreeNode(2), new TreeNode(4));
        SameTree solution = new SameTree();
        assertFalse(solution.isSameTree(p, q));
    }
}
