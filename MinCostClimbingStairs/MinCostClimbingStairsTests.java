package MinCostClimbingStairs;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MinCostClimbingStairsTests {
    MinCostClimbingStairs obj = new MinCostClimbingStairs();

    @Test
    public void testMinCostClimbingStairsExample1() {
        int[] cost = { 10, 15, 20 };
        int expected = 15;
        int result = obj.minCostClimbingStairs(cost);
        assertEquals(expected, result);
    }

    @Test
    public void testMinCostClimbingStairsExample2() {
        int[] cost = { 1, 100, 1, 1, 1, 100, 1, 1, 100, 1 };
        int expected = 6;
        int result = obj.minCostClimbingStairs(cost);
        assertEquals(expected, result);
    }

    @Test
    public void testMinCostClimbingStairsCustom1() {
        int[] cost = { 1, 2, 3, 4, 5 };
        int expected = 6;
        int result = obj.minCostClimbingStairs(cost);
        assertEquals(expected, result);
    }

    @Test
    public void testMinCostClimbingStairsCustom2() {
        int[] cost = { 10, 20, 5, 15, 10 };
        int expected = 25;
        int result = obj.minCostClimbingStairs(cost);
        assertEquals(expected, result);
    }

    @Test
    public void testMinCostClimbingStairsCustom3() {
        int[] cost = { 1, 2 };
        int expected = 1;
        int result = obj.minCostClimbingStairs(cost);
        assertEquals(expected, result);
    }
}
