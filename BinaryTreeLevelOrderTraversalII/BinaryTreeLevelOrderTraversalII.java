package BinaryTreeLevelOrderTraversalII;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversalII {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<List<Integer>>();

        Queue<TreeNode> queue = new LinkedList<>();
        if (root != null)
            queue.add(root);

        while (!queue.isEmpty()) {
            int curr_level_size = queue.size();
            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < curr_level_size; i++) {
                TreeNode node = queue.poll();
                list.add(node.val);

                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);

            }

            lists.add(list);
        }
        Collections.reverse(lists);
        return lists;
    }
}
