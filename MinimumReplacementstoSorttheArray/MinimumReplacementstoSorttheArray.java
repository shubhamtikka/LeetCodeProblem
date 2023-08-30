package MinimumReplacementstoSorttheArray;

public class MinimumReplacementstoSorttheArray {

    public long minimumReplacement(int[] nums) {
        long counter = 0;
        for (int i = nums.length - 2; i >= 0; i--) {
            int replacements = 0;
            if (nums[i] > nums[i + 1]) {
                if (nums[i] % nums[i + 1] == 0) {
                    replacements = nums[i] / nums[i + 1];
                } else {
                    replacements = (nums[i] / nums[i + 1]) + 1;

                }
                counter += replacements - 1;
                nums[i] = nums[i] / replacements;
            }
        }
        return counter;
    }

}
