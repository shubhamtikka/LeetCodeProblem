package MinOperations;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MinOperationsTests {

    @Test
    public void testMinOperationsExample1() {
        MinOperations solution = new MinOperations();
        int[] nums = { 4, 2, 5, 3 };
        int expected = 0;
        int result = solution.minOperations(nums);
        assertEquals(expected, result);
    }

    @Test
    public void testMinOperationsExample2() {
        MinOperations solution = new MinOperations();
        int[] nums = { 1, 2, 3, 5, 6 };
        int expected = 1;
        int result = solution.minOperations(nums);
        assertEquals(expected, result);
    }

    @Test
    public void testMinOperationsExample3() {
        MinOperations solution = new MinOperations();
        int[] nums = { 1, 10, 100, 1000 };
        int expected = 3;
        int result = solution.minOperations(nums);
        assertEquals(expected, result);
    }

}
