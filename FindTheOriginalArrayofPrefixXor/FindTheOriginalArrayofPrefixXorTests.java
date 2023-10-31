package FindTheOriginalArrayofPrefixXor;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class FindTheOriginalArrayofPrefixXorTests {
    @Test
    public void testExample1() {
        FindTheOriginalArrayofPrefixXor solution = new FindTheOriginalArrayofPrefixXor();
        int[] pref = { 5, 2, 0, 3, 1 };
        int[] result = solution.findArray(pref);
        int[] expected = { 5, 7, 2, 3, 2 };
        assertArrayEquals(expected, result);
    }

    @Test
    public void testExample2() {
        FindTheOriginalArrayofPrefixXor solution = new FindTheOriginalArrayofPrefixXor();
        int[] pref = { 13 };
        int[] result = solution.findArray(pref);
        int[] expected = { 13 };
        assertArrayEquals(expected, result);
    }

    @Test
    public void testAdditional() {
        FindTheOriginalArrayofPrefixXor solution = new FindTheOriginalArrayofPrefixXor();
        int[] pref = { 0, 0, 0, 0, 0 };
        int[] result = solution.findArray(pref);
        int[] expected = { 0, 0, 0, 0, 0 };
        assertArrayEquals(expected, result);
    }

}
