package BuildanArrayWithStackOperations;

import java.util.ArrayList;
import java.util.List;

public class BuildanArrayWithStackOperations {
    public List<String> buildArray(int[] target, int n) {
        List<String> output = new ArrayList<>();
        int j = 0;
        for (int i = 1; i <= n; i++) {
            output.add("Push");
            if (i != target[j]) {
                output.add("Pop");
            } else {
                j++;
                if (j == target.length)
                    break;
            }
        }
        return output;
    }
}