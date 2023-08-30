package MinimumReplacementstoSorttheArray;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MinimumReplacementstoSorttheArrayTest {

    @Test
    public void testExample1() {
        MinimumReplacementstoSorttheArray arraySorter = new MinimumReplacementstoSorttheArray();
        int[] nums = { 3, 9, 3 };
        long expected = 2;
        long result = arraySorter.minimumReplacement(nums);
        assertEquals(expected, result);
    }

    @Test
    public void testExample2() {
        MinimumReplacementstoSorttheArray arraySorter = new MinimumReplacementstoSorttheArray();
        int[] nums = { 1, 2, 3, 4, 5 };
        long expected = 0;
        long result = arraySorter.minimumReplacement(nums);
        assertEquals(expected, result);
    }

    @Test
    public void testMixedArray() {
        MinimumReplacementstoSorttheArray arraySorter = new MinimumReplacementstoSorttheArray();
        int[] nums = { 5, 8, 4, 10 };
        long expected = 2;
        long result = arraySorter.minimumReplacement(nums);
        assertEquals(expected, result);
    }

    @Test
    public void testSingleElement() {
        MinimumReplacementstoSorttheArray arraySorter = new MinimumReplacementstoSorttheArray();
        int[] nums = { 7 };
        long expected = 0;
        long result = arraySorter.minimumReplacement(nums);
        assertEquals(expected, result);
    }
}
