package MonotonicArray;

class MonotonicArray {
    public boolean isMonotonic(int[] nums) {
        return isDecreasingMonotonic(nums) || isIncreasingMonotonic(nums);
    }

    public boolean isDecreasingMonotonic(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] < nums[i]) {
                return false;
            }
        }
        return true;
    }

    public boolean isIncreasingMonotonic(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > nums[i]) {
                return false;
            }
        }
        return true;
    }
}
