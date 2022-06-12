package RotateArray;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class RotateArrayTest {
    int[] inputArray;
    int[] outputArrayExpected;
    int k;
    RotateArray rotateArray = new RotateArray();

    @Test
    public void rotateArrayTest1() {
        inputArray = new int[] { 1, 2, 3, 4, 5, 6, 7 };
        outputArrayExpected = new int[] { 5, 6, 7, 1, 2, 3, 4 };
        k = 3;
        rotateArray.rotate(inputArray, k);
        assertArrayEquals(outputArrayExpected, inputArray);
    }

    @Test
    public void rotateArrayTest2() {
        inputArray = new int[] { -1, -100, 3, 99 };
        outputArrayExpected = new int[] { 3, 99, -1, -100 };
        k = 2;
        rotateArray.rotate(inputArray, k);
        assertArrayEquals(outputArrayExpected, inputArray);
    }

    @Test
    public void rotateArrayTest3() {
        inputArray = new int[] { -1, -100, 3, 99 };
        outputArrayExpected = new int[] { 3, 99, -1, -100 };
        k = 6;
        rotateArray.rotate(inputArray, k);
        assertArrayEquals(outputArrayExpected, inputArray);
    }

}
