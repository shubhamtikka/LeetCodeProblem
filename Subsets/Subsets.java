/*
 * 78. Subsets
 * Given an integer array nums of unique elements, 
 * return all possible subsets (the power set).
 * The solution set must not contain duplicate subsets. 
 * Return the solution in any order.
 * 
 */

package Subsets;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> allSubset = new ArrayList<List<Integer>>();
        List<Integer> bag = new ArrayList<Integer>();
        makeSubsetFrom(0, nums, allSubset, bag);
        return allSubset;
    }

    private void makeSubsetFrom(int startIndex, int[] nums, List<List<Integer>> allSubset, List<Integer> bag) {

        allSubset.add(new ArrayList<Integer>(bag));

        if (startIndex >= nums.length) {
            return;
        }

        for (int i = startIndex; i < nums.length; i++) {
            bag.add(nums[i]);
            makeSubsetFrom(i + 1, nums, allSubset, bag);
            bag.remove(bag.size() - 1);
        }
        return;

    }

}
