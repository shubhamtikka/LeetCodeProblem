package BinarySearch;

/*********************
 * Test class for 704. Binary Search
 * 
 *******************/

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BinarySearchTest {
    BinarySearch binarySearch = new BinarySearch();

    @Test
    public void testBinarySearch1() {
        int[] nums = new int[] {};
        int target = 1;
        int targetIndex = binarySearch.search(nums, target);
        assertEquals("check target", -1, targetIndex);
    }

    @Test
    public void testBinarySearch2() {
        int[] nums = new int[] { -1, 0, 3, 5, 9, 12 };
        int target = 9;
        int targetIndex = binarySearch.search(nums, target);
        assertEquals("check target", 4, targetIndex);
    }

    @Test
    public void testBinarySearch3() {
        int[] nums = new int[] { -1, 0, 3, 5, 9, 12 };
        int target = 3;
        int targetIndex = binarySearch.search(nums, target);
        assertEquals("check target", 2, targetIndex);
    }

    @Test
    public void testBinarySearch4() {
        int[] nums = new int[] { -1 };
        int target = -1;
        int targetIndex = binarySearch.search(nums, target);
        assertEquals("check target", 0, targetIndex);
    }

    @Test
    public void testBinarySearch5() {
        int[] nums = new int[] { -1, 0 };
        int target = 0;
        int targetIndex = binarySearch.search(nums, target);
        assertEquals("check target", 1, targetIndex);
    }

    @Test
    public void testBinarySearch6() {
        int[] nums = new int[] { -1, 0, 3, 5, 9, 12 };
        int target = -1;
        int targetIndex = binarySearch.search(nums, target);
        assertEquals("check target", 0, targetIndex);
    }

    @Test
    public void testBinarySearch7() {
        int[] nums = new int[] { -1, 0, 3, 5, 9, 12 };
        int target = 12;
        int targetIndex = binarySearch.search(nums, target);
        assertEquals("check target", 5, targetIndex);
    }

    @Test
    public void testBinarySearch8() {
        int[] nums = new int[] { -1, 0, 3, 5, 9, 12 };
        int target = 13;
        int targetIndex = binarySearch.search(nums, target);
        assertEquals("check target", -1, targetIndex);
    }

}
