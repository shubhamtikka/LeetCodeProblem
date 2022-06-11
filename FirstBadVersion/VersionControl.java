/*********************
 * This class is a simulation of VersionControl class from the problem for testing.
 * 
 * 
 ***********************/

package FirstBadVersion;

public class VersionControl {
    int nums[];

    boolean isBadVersion(int version) {
        return nums[version] < 0;
    }

    public void setNums(int[] nums) {
        this.nums = nums;
    }

}
