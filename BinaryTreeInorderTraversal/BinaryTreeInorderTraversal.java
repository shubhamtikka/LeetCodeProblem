/*
 * 94. Binary Tree Inorder Traversal
 * 
 */
package BinaryTreeInorderTraversal;

import java.util.ArrayList;
import java.util.List;

class BinaryTreeInorderTraversal {
    List<Integer> list = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        if (root != null) {
            inorderTraversal(root.left);
            list.add(root.val);
            inorderTraversal(root.right);
        }
        return list;
    }
}