package MonotonicArray;

import org.junit.Test;
import static org.junit.Assert.*;

public class MonotonicArrayTests {

    @Test
    public void testMonotonicIncreasing() {
        MonotonicArray monotonicArray = new MonotonicArray();
        int[] nums = { 1, 2, 2, 3 };
        boolean expected = true;
        boolean result = monotonicArray.isMonotonic(nums);
        assertEquals(expected, result);
    }

    @Test
    public void testMonotonicDecreasing() {
        MonotonicArray monotonicArray = new MonotonicArray();
        int[] nums = { 6, 5, 4, 4 };
        boolean expected = true;
        boolean result = monotonicArray.isMonotonic(nums);
        assertEquals(expected, result);
    }

    @Test
    public void testNonMonotonic() {
        MonotonicArray monotonicArray = new MonotonicArray();
        int[] nums = { 1, 3, 2 };
        boolean expected = false;
        boolean result = monotonicArray.isMonotonic(nums);
        assertEquals(expected, result);
    }

    @Test
    public void testEmptyArray() {
        MonotonicArray monotonicArray = new MonotonicArray();
        int[] nums = {};
        boolean expected = true; // An empty array is considered monotonic
        boolean result = monotonicArray.isMonotonic(nums);
        assertEquals(expected, result);
    }
}
