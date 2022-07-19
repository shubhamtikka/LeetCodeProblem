/*
 * 48. Rotate Image
 * Medium
 * You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
 * You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.
 */
package RotateImage;

public class RotateImage {

    public void rotate(int[][] matrix) {
        int N = matrix[0].length - 1;

        for (int i = 0; i <= N / 2; i++) {
            rotateFrame(matrix, i, N - i);
        }
    }

    public void rotateFrame(int[][] matrix, int nthFrame, int N) {
        int i = nthFrame;
        int k = i;
        while (k < N) {
            int j = k;
            int temp1 = matrix[i][j];
            for (int x = 0; x < 4; x++) {
                int temp2 = matrix[j][N - i + nthFrame];
                matrix[j][N - i + nthFrame] = temp1;
                int tempI = i;
                i = j;
                j = N - tempI + nthFrame;
                temp1 = temp2;
            }
            k++;
        }
    }
}
