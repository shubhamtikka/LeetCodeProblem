
import org.junit.Test;
import static org.junit.Assert.*;

public class CombinationSumIVTests {

    @Test
    public void testExample1() {
        CombinationSumIV combinationSum = new CombinationSumIV();
        int[] nums = { 1, 2, 3 };
        int target = 4;
        int expected = 7;
        int result = combinationSum.combinationSum4(nums, target);
        assertEquals(expected, result);
    }

    @Test
    public void testExample2() {
        CombinationSumIV combinationSum = new CombinationSumIV();
        int[] nums = { 9 };
        int target = 3;
        int expected = 0;
        int result = combinationSum.combinationSum4(nums, target);
        assertEquals(expected, result);
    }

    @Test
    public void testEmptyArray() {
        CombinationSumIV combinationSum = new CombinationSumIV();
        int[] nums = {};
        int target = 5;
        int expected = 0; // No combinations possible with an empty array
        int result = combinationSum.combinationSum4(nums, target);
        assertEquals(expected, result);
    }

    @Test
    public void testZeroTarget() {
        CombinationSumIV combinationSum = new CombinationSumIV();
        int[] nums = { 1, 2, 3 };
        int target = 0;
        int expected = 1; // Only one way to make 0 with no numbers
        int result = combinationSum.combinationSum4(nums, target);
        assertEquals(expected, result);
    }

}
