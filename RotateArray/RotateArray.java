/*****************************
 * 189. Rotate Array
 * Given an array, rotate the array to the right by k steps, where k is non-negative.
 ****************/

package RotateArray;

public class RotateArray {

    public void rotate(int[] nums, int k) {
        if (k == 0 || k == nums.length)
            return;
        if (nums.length <= 1)
            return;

        if (k > nums.length)
            k = k % nums.length;

        int[] numsCopy = nums.clone();

        for (int i = 0; i < nums.length; i++) {
            int j = i + k;
            if (j >= nums.length)
                j = j % nums.length;
            nums[j] = numsCopy[i];
        }
    }

}
