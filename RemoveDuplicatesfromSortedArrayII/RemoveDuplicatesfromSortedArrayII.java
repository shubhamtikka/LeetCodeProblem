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