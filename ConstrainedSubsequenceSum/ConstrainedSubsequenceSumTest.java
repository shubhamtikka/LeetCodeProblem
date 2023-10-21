package ConstrainedSubsequenceSum;

import org.junit.Test;
import static org.junit.Assert.*;

public class ConstrainedSubsequenceSumTest {

    @Test
    public void testMaxSum() {
        ConstrainedSubsequenceSum solution = new ConstrainedSubsequenceSum();

        int[] nums1 = { 10, 2, -10, 5, 20 };
        int k1 = 2;
        assertEquals(37, solution.constrainedSubsetSum(nums1, k1));

        int[] nums2 = { -1, -2, -3 };
        int k2 = 1;
        assertEquals(-1, solution.constrainedSubsetSum(nums2, k2));

        int[] nums3 = { 10, -2, -10, -5, 20 };
        int k3 = 2;
        assertEquals(23, solution.constrainedSubsetSum(nums3, k3));

        // Add more test cases as needed
    }
}
