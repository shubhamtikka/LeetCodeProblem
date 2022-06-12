package SearchInsertPosition;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SerchInsertPosTest {

    SearchInsertPosition searchInsertPosObj = new SearchInsertPosition();
    int[] nums;

    @Test
    public void testSearchInsert1() {
        nums = new int[] { 1, 3, 5, 6 };
        int target = 2;
        int outIndex = searchInsertPosObj.searchInsert(nums, target);
        assertEquals(1, outIndex);
    }

    @Test
    public void testSearchInsert2() {
        nums = new int[] { 1, 3, 5, 6 };
        int target = 0;
        int outIndex = searchInsertPosObj.searchInsert(nums, target);
        assertEquals(0, outIndex);
    }

    @Test
    public void testSearchInsert3() {
        nums = new int[] { 1, 3, 5, 6 };
        int target = 8;
        int outIndex = searchInsertPosObj.searchInsert(nums, target);
        assertEquals(4, outIndex);
    }

    @Test
    public void testSearchInsert4() {
        nums = new int[] { 1, 3 };
        int target = 4;
        int outIndex = searchInsertPosObj.searchInsert(nums, target);
        assertEquals(2, outIndex);
    }

    @Test
    public void testSearchInsert5() {
        nums = new int[] { 1, 3 };
        int target = 2;
        int outIndex = searchInsertPosObj.searchInsert(nums, target);
        assertEquals(1, outIndex);
    }

}
