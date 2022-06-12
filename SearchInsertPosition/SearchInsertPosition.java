/*
* 35. Search Insert Position
 * Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 * You must write an algorithm with O(log n) runtime complexity.
 * 
 * 
 */

package SearchInsertPosition;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {

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
        return startIndex; // Target not found in array
    }
}
