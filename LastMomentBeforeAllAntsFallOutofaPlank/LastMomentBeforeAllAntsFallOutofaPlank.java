package LastMomentBeforeAllAntsFallOutofaPlank;

import java.util.Arrays;

public class LastMomentBeforeAllAntsFallOutofaPlank {
    public int getLastMoment(int n, int[] left, int[] right) {

        int maxLeft = Arrays.stream(left).max().orElse(0);

        int minRight = n - Arrays.stream(right).min().orElse(n);

        return Math.max(maxLeft, minRight);
    }
}
