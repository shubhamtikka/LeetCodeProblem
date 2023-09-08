package PascalsTriangle;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class PascalsTriangleTests {

    @Test
    public void testExample1() {
        PascalsTriangle pascalsTriangle = new PascalsTriangle();
        int numRows = 5;
        List<List<Integer>> expected = List.of(
                List.of(1),
                List.of(1, 1),
                List.of(1, 2, 1),
                List.of(1, 3, 3, 1),
                List.of(1, 4, 6, 4, 1));
        List<List<Integer>> result = pascalsTriangle.generate(numRows);
        assertEquals(expected, result);
    }

    @Test
    public void testExample2() {
        PascalsTriangle pascalsTriangle = new PascalsTriangle();
        int numRows = 1;
        List<List<Integer>> expected = List.of(List.of(1));
        List<List<Integer>> result = pascalsTriangle.generate(numRows);
        assertEquals(expected, result);
    }

    @Test
    public void testZeroRows() {
        PascalsTriangle pascalsTriangle = new PascalsTriangle();
        int numRows = 0;
        List<List<Integer>> expected = List.of();
        List<List<Integer>> result = pascalsTriangle.generate(numRows);
        assertEquals(expected, result);
    }

    @Test
    public void testTenRows() {
        PascalsTriangle pascalsTriangle = new PascalsTriangle();
        int numRows = 10;
        List<List<Integer>> result = pascalsTriangle.generate(numRows);
        // Validate that the number of rows generated matches numRows
        assertEquals(numRows, result.size());
        // Validate that each row has the correct number of elements
        for (int i = 0; i < numRows; i++) {
            assertEquals(i + 1, result.get(i).size());
        }
    }
}
