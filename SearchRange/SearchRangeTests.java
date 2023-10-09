package SearchRange;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class SearchRangeTests {

    @Test
    public void testSearchRangeExample1() {
        SearchRange solution = new SearchRange();
        int[] nums = { 5, 7, 7, 8, 8, 10 };
        int target = 8;
        int[] expected = { 3, 4 };
        int[] result = solution.searchRange(nums, target);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testSearchRangeExample2() {
        SearchRange solution = new SearchRange();
        int[] nums = { 5, 7, 7, 8, 8, 10 };
        int target = 6;
        int[] expected = { -1, -1 };
        int[] result = solution.searchRange(nums, target);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testSearchRangeExample3() {
        SearchRange solution = new SearchRange();
        int[] nums = {};
        int target = 0;
        int[] expected = { -1, -1 };
        int[] result = solution.searchRange(nums, target);

        assertArrayEquals(expected, result);
    }

    @Test
    public void testSearchRangeCustom1() {
        SearchRange solution = new SearchRange();
        int[] nums = { 1, 2, 2, 3, 3, 3, 4 };
        int target = 3;
        int[] expected = { 3, 5 };
        int[] result = solution.searchRange(nums, target);

        assertArrayEquals(expected, result);
    }

    @Test
    public void testSearchRangeCustom2() {
        SearchRange solution = new SearchRange();
        int[] nums = { 2, 2 };
        int target = 2;
        int[] expected = { 0, 1 };
        int[] result = solution.searchRange(nums, target);

        assertArrayEquals(expected, result);
    }

    @Test
    public void testSearchRangeCustom3() {
        SearchRange solution = new SearchRange();
        int[] nums = { 1, 2, 3, 3, 3, 3, 4, 5, 9 };
        int target = 3;
        int[] expected = { 2, 5 };
        int[] result = solution.searchRange(nums, target);

        assertArrayEquals(expected, result);
    }
}
