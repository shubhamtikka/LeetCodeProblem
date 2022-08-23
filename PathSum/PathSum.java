package PathSum;

public class PathSum {

    public boolean hasPathSum(TreeNode root, int targetSum) {
        return hasPathSumRecHelper(root, 0, targetSum);
    }

    private boolean hasPathSumRecHelper(TreeNode node, int prevSum, int targetSum) {
        if (node == null) {
            return false;
        }
        int currentSum = prevSum + node.val;
        if (node.left == null && node.right == null) {
            return currentSum == targetSum;
        }
        return hasPathSumRecHelper(node.left, currentSum, targetSum) ||
                hasPathSumRecHelper(node.right, currentSum, targetSum);
    }
}
