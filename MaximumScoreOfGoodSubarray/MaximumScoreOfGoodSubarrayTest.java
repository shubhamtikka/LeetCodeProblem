package MaximumScoreOfGoodSubarray;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MaximumScoreOfGoodSubarrayTest {

    @Test
    public void testExample1() {
        int[] nums = { 1, 4, 3, 7, 4, 5 };
        int k = 3;
        MaximumScoreOfGoodSubarray solution = new MaximumScoreOfGoodSubarray();
        int result = solution.maximumScore(nums, k);
        assertEquals(15, result);
    }

    @Test
    public void testExample2() {
        int[] nums = { 5, 5, 4, 5, 4, 1, 1, 1 };
        int k = 0;
        MaximumScoreOfGoodSubarray solution = new MaximumScoreOfGoodSubarray();
        int result = solution.maximumScore(nums, k);
        assertEquals(20, result);
    }

    @Test
    public void testCustom1() {
        int[] nums = { 3, 2, 1, 4, 5 };
        int k = 2;
        MaximumScoreOfGoodSubarray solution = new MaximumScoreOfGoodSubarray();
        int result = solution.maximumScore(nums, k);
        assertEquals(5, result);
    }

    @Test
    public void testCustom2() {
        int[] nums = { 10, 5, 1, 20, 15, 5, 6 };
        int k = 5;
        MaximumScoreOfGoodSubarray solution = new MaximumScoreOfGoodSubarray();
        int result = solution.maximumScore(nums, k);
        assertEquals(20, result);
    }
}
