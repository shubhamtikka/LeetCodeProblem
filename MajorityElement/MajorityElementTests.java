package MajorityElement;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MajorityElementTests {

    @Test
    public void testMajorityElement() {
        MajorityElement solution = new MajorityElement();

        // Test case 1
        int[] nums1 = { 3, 2, 3 };
        int expected1 = 3;
        int result1 = solution.majorityElement(nums1);
        assertEquals(expected1, result1);

        // Test case 2
        int[] nums2 = { 2, 2, 1, 1, 1, 2, 2 };
        int expected2 = 2;
        int result2 = solution.majorityElement(nums2);
        assertEquals(expected2, result2);

        // Test case 3 (Only one element in the array)
        int[] nums3 = { 5 };
        int expected3 = 5;
        int result3 = solution.majorityElement(nums3);
        assertEquals(expected3, result3);

        // Test case 4 (Large array with the majority element at the beginning)
        int[] nums4 = { 7, 7, 7, 7, 4, 5, 6 };
        int expected4 = 7;
        int result4 = solution.majorityElement(nums4);
        assertEquals(expected4, result4);

        // Test case 5 (Large array with the majority element at the end)
        int[] nums5 = { 1, 2, 3, 4, 5, 6, 7, 7, 7 };
        int expected5 = 7;
        int result5 = solution.majorityElement(nums5);
        assertEquals(expected5, result5);
    }
}
