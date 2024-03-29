package FindLargestValueInEachRow;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FindLargestValueInEachRow {

    public List<Integer> largestValues(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        if (root == null)
            return list;

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int currLevelSize = queue.size();
            int max = Integer.MIN_VALUE;

            for (int i = 0; i < currLevelSize; i++) {
                TreeNode node = queue.poll();
                max = Math.max(max, node.val);

                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);
            }
            list.add(max);
        }
        return list;
    }

}
