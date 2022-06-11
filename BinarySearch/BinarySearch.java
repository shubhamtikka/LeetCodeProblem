package BinarySearch;

/*******************
 * 704. Binary Search
 * Given an array of integers nums which is sorted in ascending order, and an
 * integer target, write a function to search target in nums. If target exists,
 * then return its index. Otherwise, return -1.
 * 
 * You must write an algorithm with O(log n) runtime complexity.
 * 
 * Author : Shubham Tikka
 ********************/

class BinarySearch {
    public int search(int[] nums, int target) {
        if (nums.length == 0)
            return -1;

        int startIndex, endIndex, midIndex;
        startIndex = 0;
        endIndex = nums.length - 1;

        while (startIndex <= endIndex) {
            midIndex = startIndex + ((endIndex - startIndex) / 2);
            if (nums[midIndex] == target) {
                return midIndex; // Target found.
            } else if (nums[midIndex] < target) {
                startIndex = midIndex + 1; // Look for the target on right side of array
            } else { // nums[midIndex] > target
                endIndex = midIndex - 1; // Look for the target on left side of array
            }
        }
        return -1; // Target not found in array
    }
}