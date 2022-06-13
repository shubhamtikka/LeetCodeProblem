/*
 * 283. Move Zeroes
 * 
 * Given an integer array nums, move all 0's to the end of it while maintaining the 
 * relative order of the non-zero elements.
 * Note that you must do this in-place without making a copy of the array.
 * 
 */

package MoveZeroes;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int countOfNonZeros = 0;

        // Replace 0's with next nonZero number in the array.
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[countOfNonZeros] = nums[i];
                countOfNonZeros++;
            }
        }
        // Add Zeros after the count of nonZero integers in array
        for (int i = countOfNonZeros; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public void swap(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}
