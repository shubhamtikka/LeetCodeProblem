package NumberofGoodPairs;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class NumberOfGoodPairsTests {

    @Test
    public void testExample1() {
        NumberOfGoodPairs goodPairs = new NumberOfGoodPairs();
        int[] nums = { 1, 2, 3, 1, 1, 3 };
        int expected = 4;
        int result = goodPairs.numIdenticalPairs(nums);
        assertEquals(expected, result);
    }

    @Test
    public void testExample2() {
        NumberOfGoodPairs goodPairs = new NumberOfGoodPairs();
        int[] nums = { 1, 1, 1, 1 };
        int expected = 6;
        int result = goodPairs.numIdenticalPairs(nums);
        assertEquals(expected, result);
    }

    @Test
    public void testExample3() {
        NumberOfGoodPairs goodPairs = new NumberOfGoodPairs();
        int[] nums = { 1, 2, 3 };
        int expected = 0;
        int result = goodPairs.numIdenticalPairs(nums);
        assertEquals(expected, result);
    }

    @Test
    public void testEdgeCase() {
        NumberOfGoodPairs goodPairs = new NumberOfGoodPairs();
        int[] nums = { 1 };
        int expected = 0;
        int result = goodPairs.numIdenticalPairs(nums);
        assertEquals(expected, result);
    }
}
