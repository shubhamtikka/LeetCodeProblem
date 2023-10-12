package FindInMountainArray;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FindInMountainArrayTests {
    FindInMountainArray findInMountainArray = new FindInMountainArray();

    @Test
    public void testFindInMountainArrayExample1() {
        int[] arr = { 1, 2, 3, 4, 5, 3, 1 };
        MountainArray mountainArray = new MountainArrayImpl(arr);
        int target = 3;
        int expected = 2;
        int result = findInMountainArray.findInMountainArray(target, mountainArray);
        assertEquals(expected, result);
    }

    @Test
    public void testFindInMountainArrayExample2() {
        int[] arr = { 0, 1, 2, 4, 2, 1 };
        MountainArray mountainArray = new MountainArrayImpl(arr);
        int target = 3;
        int expected = -1;
        int result = findInMountainArray.findInMountainArray(target, mountainArray);
        assertEquals(expected, result);
    }

    @Test
    public void testFindInMountainArrayCustom1() {
        int[] arr = { 3, 5, 8, 12, 9, 7, 4, 2, 1 };
        MountainArray mountainArray = new MountainArrayImpl(arr);
        int target = 9;
        int expected = 4;
        int result = findInMountainArray.findInMountainArray(target, mountainArray);
        assertEquals(expected, result);
    }

    @Test
    public void testFindInMountainArrayCustom2() {
        int[] arr = { 2, 4, 7, 11, 8, 6, 4, 3, 2, 1 };
        MountainArray mountainArray = new MountainArrayImpl(arr);
        int target = 10;
        int expected = -1;
        int result = findInMountainArray.findInMountainArray(target, mountainArray);
        assertEquals(expected, result);
    }

}
