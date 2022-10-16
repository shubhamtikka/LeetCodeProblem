package MedianOfTwoSortedArrays;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MedianOfTwoSortedArraysTests {

    MedianOfTwoSortedArrays obj = new MedianOfTwoSortedArrays();

    double epsilon = 0.000001d;

    @Test
    public void testFindMedianSortedArrays1() {
        int[] nums1 = new int[] { 1, 2 };
        int[] nums2 = new int[] { 3 };

        double expected = 2;
        double actual = obj.findMedianSortedArrays(nums1, nums2);
        System.out.println(actual);
        assertEquals(expected, actual, epsilon);
    }

    @Test
    public void testFindMedianSortedArrays2() {
        int[] nums1 = new int[] { 1, 2 };
        int[] nums2 = new int[] { 3, 4 };

        double expected = 2.5;
        double actual = obj.findMedianSortedArrays(nums1, nums2);

        assertEquals(expected, actual, epsilon);
    }

    @Test
    public void testFindMedianSortedArrays3() {
        int[] nums1 = new int[] { 1, 2, 6 };
        int[] nums2 = new int[] { 3, 4, 8 };

        double expected = 3.5;
        double actual = obj.findMedianSortedArrays(nums1, nums2);

        assertEquals(expected, actual, epsilon);
    }

}
