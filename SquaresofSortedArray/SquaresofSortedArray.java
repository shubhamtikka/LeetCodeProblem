/************************************
 * Given an integer array nums sorted in non-decreasing order, 
 * return an array of the squares of each number sorted in non-decreasing order.
 *
 ***********************************/
package SquaresofSortedArray;

import java.util.Arrays;

public class SquaresofSortedArray {

    public int[] sortedSquares(int[] nums) {
        int[] numsSquared = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numsSquared[i] = nums[i] * nums[i];
        }
        Arrays.sort(numsSquared);
        return numsSquared;
    }

}
