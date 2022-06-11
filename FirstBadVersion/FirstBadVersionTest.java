package FirstBadVersion;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FirstBadVersionTest {

    FirstBadVersion firstBadVersionObj = new FirstBadVersion();

    @Test
    public void testFirstBadVersion1() {
        int[] nums = new int[] { 0, 1, 2, 3, 4, -1, -1, -1, -1 };
        firstBadVersionObj.setNums(nums);
        int firstBadVersion = firstBadVersionObj.firstBadVersion(nums.length - 1);
        assertEquals("Check first bad version", 5, firstBadVersion);
    }

    @Test
    public void testFirstBadVersion2() {
        int[] nums = new int[] { 0, 1, 2, -1, -1, -1, -1 };
        firstBadVersionObj.setNums(nums);
        int firstBadVersion = firstBadVersionObj.firstBadVersion(nums.length - 1);
        assertEquals("Check first bad version", 3, firstBadVersion);
    }

    @Test
    public void testFirstBadVersion3() {
        int[] nums = new int[] { 0, -1 };
        firstBadVersionObj.setNums(nums);
        int firstBadVersion = firstBadVersionObj.firstBadVersion(nums.length - 1);
        assertEquals("Check first bad version", 1, firstBadVersion);
    }

    @Test
    public void testFirstBadVersion4() {
        int[] nums = new int[] { 0, 1, 2, 3, 4, 5, -1 };
        firstBadVersionObj.setNums(nums);
        int firstBadVersion = firstBadVersionObj.firstBadVersion(nums.length - 1);
        assertEquals("Check first bad version", 6, firstBadVersion);
    }
}
