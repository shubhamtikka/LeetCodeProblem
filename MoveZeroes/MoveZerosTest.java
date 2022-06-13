package MoveZeroes;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class MoveZerosTest {
    MoveZeroes moveZerosObj = new MoveZeroes();

    @Test
    public void moveZeroesTest1() {
        int[] nums = new int[] { 0, 1, 0, 3, 12 };
        int[] expectedNums = new int[] { 1, 3, 12, 0, 0 };
        moveZerosObj.moveZeroes(nums);
        assertArrayEquals(expectedNums, nums);
    }

    @Test
    public void moveZeroesTest2() {
        int[] nums = new int[] { 0 };
        int[] expectedNums = new int[] { 0 };
        moveZerosObj.moveZeroes(nums);
        assertArrayEquals(expectedNums, nums);
    }

}
