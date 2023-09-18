package TheKWeakestRowsinaMatrix;

import java.util.Arrays;

public class TheKWeakestRowsinaMatrix {
    public int[] kWeakestRows(int[][] mat, int k) {
        int N = mat.length;

        int[] result = new int[k];
        int[][] strength = new int[N][2];

        for (int i = 0; i < N; i++) {
            int strengthCounter = 0;
            int j = 0;
            while (j < mat[i].length
                    &&
                    mat[i][j] == 1) {
                strengthCounter++;
                j++;
            }
            strength[i][0] = strengthCounter;
            strength[i][1] = i;

        }

        Arrays.sort(strength, (a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);

        for (int i = 0; i < k; i++) {
            result[i] = strength[i][1];
        }

        return result;
    }
}