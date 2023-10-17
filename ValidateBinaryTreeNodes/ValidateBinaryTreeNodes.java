package ValidateBinaryTreeNodes;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Set;

public class ValidateBinaryTreeNodes {
    public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {
        Deque<Integer> queue = new ArrayDeque<>();
        Set<Integer> visited = new HashSet<>();

        int root = findroot(n, leftChild, rightChild);
        if (root == -1)
            return false;

        queue.offer(root);

        while (!queue.isEmpty()) {
            int node = queue.poll();
            if (node == -1)
                continue;
            if (!visited.add(node))
                return false;

            queue.offer(leftChild[node]);
            queue.offer(rightChild[node]);
        }
        return visited.size() == n;
    }

    public int findroot(int n, int[] leftChild, int[] rightChild) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++)
            set.add(i);
        for (int i = 0; i < leftChild.length; i++) {
            if (leftChild[i] != -1)
                set.remove(leftChild[i]);
        }
        for (int i = 0; i < rightChild.length; i++) {
            if (rightChild[i] != -1)
                set.remove(rightChild[i]);
        }
        return set.size() == 1 ? set.iterator().next() : -1;
    }
}
