package PeakIndexInMountainArray;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PeakIndexInMountainArrayTests {
    PeakIndexInMountainArray obj = new PeakIndexInMountainArray();

    @Test
    public void testPeakIndexInMountainArrayExample1() {
        int[] arr = { 0, 1, 0 };
        int expected = 1;
        int result = obj.peakIndexInMountainArray(arr);
        assertEquals(expected, result);
    }

    @Test
    public void testPeakIndexInMountainArrayExample2() {
        int[] arr = { 0, 2, 1, 0 };
        int expected = 1;
        int result = obj.peakIndexInMountainArray(arr);
        assertEquals(expected, result);
    }

    @Test
    public void testPeakIndexInMountainArrayExample3() {
        int[] arr = { 0, 10, 5, 2 };
        int expected = 1;
        int result = obj.peakIndexInMountainArray(arr);
        assertEquals(expected, result);
    }

    @Test
    public void testPeakIndexInMountainArrayCustom1() {
        int[] arr = { 1, 3, 6, 8, 12, 9, 6, 4, 2 };
        int expected = 4;
        int result = obj.peakIndexInMountainArray(arr);
        assertEquals(expected, result);
    }

    @Test
    public void testPeakIndexInMountainArrayCustom2() {
        int[] arr = { 1, 2, 3, 4, 5 };
        int expected = 4;
        int result = obj.peakIndexInMountainArray(arr);
        assertEquals(expected, result);
    }
}
