/*
 * 80. Remove Duplicates from Sorted Array II
 * Medium
 * Given an integer array nums sorted in non-decreasing order, remove some duplicates in-place such that each unique element appears at most twice. The relative order of the elements should be kept the same.
 * Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.
 * Return k after placing the final result in the first k slots of nums.
 * Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.
 */
package RemoveDuplicatesfromSortedArrayII;

import java.util.Arrays;

class RemoveDuplicatesfromSortedArrayII {

    public int removeDuplicates(int[] nums) {
        int lastIndex = nums.length - 1;
        if (nums[0] == nums[lastIndex])
            return 2;
        if (lastIndex < 3)
            return nums.length;

        int MAX_COUNT = 2; // One number is allowed only twice.

        int current_val = nums[0];
        int current_val_count = 1;

        for (int i = 1; i <= lastIndex; i++) {

            if (nums[i] == nums[i - 1]) {
                current_val_count++;
            } else {
                current_val = nums[i];
                current_val_count = 1;
            }
            if (current_val_count > MAX_COUNT) {
                bubbleIndexToEnd(nums, i, lastIndex);
                i--;
                lastIndex--;
            }
        }
        return lastIndex + 1;
    }

    private void bubbleIndexToEnd(int[] nums, int currentIndex, int lastIndex) {
        while (currentIndex < lastIndex) {
            // swap
            int temp = nums[currentIndex];
            nums[currentIndex] = nums[currentIndex + 1];
            nums[currentIndex + 1] = temp;
            currentIndex++;
        }
    }

}