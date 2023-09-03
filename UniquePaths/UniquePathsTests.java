package UniquePaths;

import org.junit.Test;
import static org.junit.Assert.*;

public class UniquePathsTests {

    @Test
    public void testExample1() {
        UniquePaths robotPaths = new UniquePaths();
        int m = 3;
        int n = 7;
        int expected = 28;
        int result = robotPaths.uniquePaths(m, n);
        assertEquals(expected, result);
    }

    @Test
    public void testExample2() {
        UniquePaths robotPaths = new UniquePaths();
        int m = 3;
        int n = 2;
        int expected = 3;
        int result = robotPaths.uniquePaths(m, n);
        assertEquals(expected, result);
    }

    @Test
    public void testMinimumGrid() {
        UniquePaths robotPaths = new UniquePaths();
        int m = 1;
        int n = 1;
        int expected = 1; // Only one cell, so only one path
        int result = robotPaths.uniquePaths(m, n);
        assertEquals(expected, result);
    }

    @Test
    public void testSquareGrid() {
        UniquePaths robotPaths = new UniquePaths();
        int m = 5;
        int n = 5;
        int expected = 70; // 5x5 grid has 70 unique paths
        int result = robotPaths.uniquePaths(m, n);
        assertEquals(expected, result);
    }

    @Test
    public void testRectangularGrid() {
        UniquePaths robotPaths = new UniquePaths();
        int m = 4;
        int n = 6;
        int expected = 56; // 4x6 grid has 56 unique paths
        int result = robotPaths.uniquePaths(m, n);
        assertEquals(expected, result);
    }
}
