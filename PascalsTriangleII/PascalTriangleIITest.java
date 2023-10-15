package PascalsTriangleII;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

import java.util.List;

public class PascalTriangleIITest {

    @Test
    public void testExample1() {
        PascalsTriangleII solution = new PascalsTriangleII();
        int rowIndex = 3;
        List<Integer> expected = List.of(1, 3, 3, 1);
        List<Integer> result = solution.getRow(rowIndex);
        assertArrayEquals(expected.toArray(), result.toArray());
    }

    @Test
    public void testExample2() {
        PascalsTriangleII solution = new PascalsTriangleII();
        int rowIndex = 0;
        List<Integer> expected = List.of(1);
        List<Integer> result = solution.getRow(rowIndex);
        assertArrayEquals(expected.toArray(), result.toArray());
    }

    @Test
    public void testExample3() {
        PascalsTriangleII solution = new PascalsTriangleII();
        int rowIndex = 1;
        List<Integer> expected = List.of(1, 1);
        List<Integer> result = solution.getRow(rowIndex);
        assertArrayEquals(expected.toArray(), result.toArray());
    }
}