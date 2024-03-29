package DeleteNodeInBST;

public class DeleteNodeInBST {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null)
            return root;
        if (key < root.val) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.val) {
            root.right = deleteNode(root.right, key);
        } else {
            if (root.left == null) {
                root = root.right;
                return root;
            }
            if (root.right == null) {
                root = root.left;
                return root;
            }

            root.val = getMin(root.right);
            root.right = deleteNode(root.right, root.val);

        }
        return root;
    }

    public int getMin(TreeNode node) {
        int min = node.val;
        while (node.left != null) {
            node = node.left;
            min = node.val;
        }
        return min;
    }
}
