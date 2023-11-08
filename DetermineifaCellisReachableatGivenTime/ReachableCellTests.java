package DetermineifaCellisReachableatGivenTime;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ReachableCellTests {

    @Test
    public void testExample1() {
        ReachableCell solution = new ReachableCell();
        int sx = 2, sy = 4, fx = 7, fy = 7, t = 6;
        boolean result = solution.isReachableAtTime(sx, sy, fx, fy, t);
        assertEquals(true, result);
    }

    @Test
    public void testExample2() {
        ReachableCell solution = new ReachableCell();
        int sx = 3, sy = 1, fx = 7, fy = 3, t = 3;
        boolean result = solution.isReachableAtTime(sx, sy, fx, fy, t);
        assertEquals(false, result);
    }

    @Test
    public void testSameCell() {
        ReachableCell solution = new ReachableCell();
        int sx = 5, sy = 5, fx = 5, fy = 5, t = 0;
        boolean result = solution.isReachableAtTime(sx, sy, fx, fy, t);
        assertEquals(true, result);
    }

    @Test
    public void testImpossibleToReach() {
        ReachableCell solution = new ReachableCell();
        int sx = 1, sy = 1, fx = 9, fy = 9, t = 4;
        boolean result = solution.isReachableAtTime(sx, sy, fx, fy, t);
        assertEquals(false, result);
    }

    @Test
    public void testLargeGrid() {
        ReachableCell solution = new ReachableCell();
        int sx = 1, sy = 1, fx = 1000000000, fy = 1000000000, t = 1000000000;
        boolean result = solution.isReachableAtTime(sx, sy, fx, fy, t);
        assertEquals(true, result);
    }
}
