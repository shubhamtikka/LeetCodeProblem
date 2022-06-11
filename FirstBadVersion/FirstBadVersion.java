
/************************************
 * 278. First Bad Version
You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check. Since each version is developed based on the previous version, all the versions after a bad version are also bad.

Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.

You are given an API bool isBadVersion(version) which returns whether version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.

The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); 
      
*************************************************/
package FirstBadVersion;

public class FirstBadVersion extends VersionControl {

    public int firstBadVersion(int n) {
        int si = 1;
        int ei = n;
        int mid;
        while (si <= ei) {
            mid = si + (ei - si) / 2;
            if (isFirstBadVersion(mid))
                return mid;
            if (!isBadVersion(mid))
                si = mid + 1;
            else
                ei = mid - 1;

        }
        return -1;
    }

    // If the previous version of a bad version is good version then that bad
    // version is the first bad version
    private boolean isFirstBadVersion(int n) {
        return isBadVersion(n) && !isBadVersion(n - 1);
    }
}