package TwoSumII_InputArrayIsSorted;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

import org.junit.Test;

public class TwoSumIITest {

    TwoSumII twoSumObj = new TwoSumII();

    @Test
    public void twoSumTest1() {
        int[] nums = new int[] { 2, 7, 11, 15 };
        int target = 9;
        int[] expectedArray = new int[] { 1, 2 };
        int[] outputArray = twoSumObj.twoSum(nums, target);
        assertArrayEquals(expectedArray, outputArray);
    }

    @Test
    public void twoSumTest2() {
        int[] nums = new int[] { 2, 3, 4 };
        int target = 6;
        int[] expectedArray = new int[] { 1, 3 };
        int[] outputArray = twoSumObj.twoSum(nums, target);
        System.out.println(Arrays.toString(outputArray));
        assertArrayEquals(expectedArray, outputArray);
    }

    @Test
    public void twoSumTest3() {
        int[] nums = new int[] { -1, 0 };
        int target = -1;
        int[] expectedArray = new int[] { 1, 2 };
        int[] outputArray = twoSumObj.twoSum(nums, target);
        assertArrayEquals(expectedArray, outputArray);
    }

}
