package FindCorrespondingNode;

public class FindCorrespondingNode {

    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        int targetVal = target.val;
        return getNode(cloned, targetVal);
    }

    private TreeNode getNode(TreeNode root, int target) {
        if (root == null)
            return root;
        if (root.val == target)
            return root;
        TreeNode node = getNode(root.left, target);
        if (node == null) {
            node = getNode(root.right, target);
        }
        return node;
    }
}
