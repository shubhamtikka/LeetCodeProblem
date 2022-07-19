package RotateImage;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class RotateImageTest {

    RotateImage rotateImageObj = new RotateImage();

    @Test
    public void rotateTest1() {
        int[][] input = new int[][] { { 5, 1, 9, 11 }, { 2, 4, 8, 10 }, { 13, 3, 6, 7 }, { 15, 14, 12, 16 } };
        // System.out.println("before");
        // printMatrix(input);
        int[][] expectedOutput = new int[][] { { 15, 13, 2, 5 }, { 14, 3, 4, 1 }, { 12, 6, 8, 9 }, { 16, 7, 10, 11 } };
        rotateImageObj.rotate(input);
        assertArrayEquals(input, expectedOutput);

        // System.out.println("After");
        // printMatrix(input);
    }

    @Test
    public void rotateTest2() {
        int[][] input = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        // System.out.println("before");
        // printMatrix(input);
        int[][] expectedOutput = new int[][] { { 7, 4, 1 }, { 8, 5, 2 }, { 9, 6, 3 } };
        rotateImageObj.rotate(input);
        assertArrayEquals(input, expectedOutput);

        // System.out.println("After");
        // printMatrix(input);
    }

    @Test
    public void rotateTest3() {
        int[][] input = new int[][] { { 1 } };
        // System.out.println("before");
        // printMatrix(input);
        int[][] expectedOutput = new int[][] { { 1 } };
        rotateImageObj.rotate(input);
        assertArrayEquals(input, expectedOutput);

        // System.out.println("After");
        // printMatrix(input);
    }

    @Test
    public void rotateTest4() {
        int[][] input = new int[][] { { 1, 2 }, { 3, 4 } };
        // System.out.println("before");
        // printMatrix(input);
        int[][] expectedOutput = new int[][] { { 3, 1 }, { 4, 2 } };
        rotateImageObj.rotate(input);
        assertArrayEquals(input, expectedOutput);

        // System.out.println("After");
        // printMatrix(input);
    }

    public void printMatrix(int[][] A) {
        int N = A[0].length;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }

}
