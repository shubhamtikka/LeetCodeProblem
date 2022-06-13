/************************
 * 
 * 167. Two Sum II - Input Array Is Sorted
 * 
 * Given a 1-indexed array of integers numbers that is already sorted in 
 * non-decreasing order, find two numbers such that they add up to a specific 
 * target number. 
 * Let these two numbers be numbers[index1] and numbers[index2] 
 * where 1 <= index1 < index2 <= numbers.length. 
 * Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.
 * The tests are generated such that there is exactly one solution. 
 * You may not use the same element twice.
 * Your solution must use only constant extra space.
 * 
 * 
 ************************/

package TwoSumII_InputArrayIsSorted;

public class TwoSumII {

    public int[] twoSum(int[] numbers, int target) {

        int startIndex = 0;
        int endIndex = numbers.length - 1;

        while (startIndex < endIndex) {

            if ((numbers[startIndex] + numbers[endIndex]) < target) {
                startIndex++;
            } else if ((numbers[startIndex] + numbers[endIndex]) > target) {
                endIndex--;
            } else {
                return new int[] { ++startIndex, ++endIndex }; // +1 because, pair is not being counted as
                                                               // zero indexed array for output
            }
        }
        return new int[] { -1, -1 };
    }

}
