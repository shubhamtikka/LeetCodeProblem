package MaxDotProduct;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MaxDotProductTests {

    @Test
    public void testMaxDotProductExample1() {
        MaxDotProduct solution = new MaxDotProduct();
        int[] nums1 = { 2, 1, -2, 5 };
        int[] nums2 = { 3, 0, -6 };
        int expected = 18;
        int result = solution.maxDotProduct(nums1, nums2);
        assertEquals(expected, result);
    }

    @Test
    public void testMaxDotProductExample2() {
        MaxDotProduct solution = new MaxDotProduct();
        int[] nums1 = { 3, -2 };
        int[] nums2 = { 2, -6, 7 };
        int expected = 21;
        int result = solution.maxDotProduct(nums1, nums2);
        assertEquals(expected, result);
    }

    @Test
    public void testMaxDotProductExample3() {
        MaxDotProduct solution = new MaxDotProduct();
        int[] nums1 = { -1, -1 };
        int[] nums2 = { 1, 1 };
        int expected = -1;
        int result = solution.maxDotProduct(nums1, nums2);
        assertEquals(expected, result);
    }

}