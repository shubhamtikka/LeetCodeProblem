package SearchRange;

public class SearchRange {
    public int[] searchRange(int[] nums, int target) {
        int[] range = new int[] { -1, -1 };
        if (nums.length == 0)
            return range;

        int first = findFirst(nums, target);
        int last = findLast(nums, target);

        range[0] = first;
        range[1] = last;

        return range;
    }

    public int findFirst(int[] nums, int target) {
        int si = 0, ei = nums.length - 1;
        int mid = -1;
        while (si <= ei) {
            mid = si + ((ei - si) / 2);

            if (nums[mid] < target) {
                si = mid + 1;
            } else if (nums[mid] > target) {
                ei = mid - 1;
            } else {
                // found target
                if (mid == 0 || nums[mid - 1] < target) {
                    return mid;
                } else {
                    ei = mid - 1;
                }
            }
        }
        return -1;
    }

    public int findLast(int[] nums, int target) {
        int si = 0, ei = nums.length - 1;
        int mid = -1;
        while (si <= ei) {
            mid = si + ((ei - si) / 2);
            if (nums[mid] < target) {
                si = mid + 1;
            } else if (nums[mid] > target) {
                ei = mid - 1;
            } else {
                // found target
                if (mid == nums.length - 1 || nums[mid + 1] > target) {
                    return mid;
                } else {
                    si = mid + 1;
                }
            }
        }
        return -1;
    }
}