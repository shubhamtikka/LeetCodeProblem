package TheKWeakestRowsinaMatrix;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class TheKWeakestRowsinaMatrixTests {

    @Test
    public void testExample1() {
        TheKWeakestRowsinaMatrix TheKWeakestRowsinaMatrix = new TheKWeakestRowsinaMatrix();
        int[][] mat = {
                { 1, 1, 0, 0, 0 }, // 2
                { 1, 1, 1, 1, 0 }, // 4
                { 1, 0, 0, 0, 0 }, // 1
                { 1, 1, 0, 0, 0 }, // 2
                { 1, 1, 1, 1, 1 } // 5
        };
        int k = 3;
        int[] expected = { 2, 0, 3 };
        int[] result = TheKWeakestRowsinaMatrix.kWeakestRows(mat, k);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testExample2() {
        TheKWeakestRowsinaMatrix TheKWeakestRowsinaMatrix = new TheKWeakestRowsinaMatrix();
        int[][] mat = {
                { 1, 0, 0, 0 },
                { 1, 1, 1, 1 },
                { 1, 0, 0, 0 },
                { 1, 0, 0, 0 }
        };
        int k = 2;
        int[] expected = { 0, 2 };
        int[] result = TheKWeakestRowsinaMatrix.kWeakestRows(mat, k);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testAllOnes() {
        TheKWeakestRowsinaMatrix TheKWeakestRowsinaMatrix = new TheKWeakestRowsinaMatrix();
        int[][] mat = {
                { 1, 1, 1 },
                { 1, 1, 1 },
                { 1, 1, 1 }
        };
        int k = 3;
        int[] expected = { 0, 1, 2 };
        int[] result = TheKWeakestRowsinaMatrix.kWeakestRows(mat, k);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testAllZeroes() {
        TheKWeakestRowsinaMatrix TheKWeakestRowsinaMatrix = new TheKWeakestRowsinaMatrix();
        int[][] mat = {
                { 0, 0, 0 },
                { 0, 0, 0 },
                { 0, 0, 0 }
        };
        int k = 2;
        int[] expected = { 0, 1 };
        int[] result = TheKWeakestRowsinaMatrix.kWeakestRows(mat, k);
        assertArrayEquals(expected, result);
    }
}
