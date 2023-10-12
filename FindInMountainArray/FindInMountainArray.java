package FindInMountainArray;

public class FindInMountainArray {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int N = mountainArr.length();
        // find peak
        int si = 0, ei = N - 1, mid = 0;
        int peakIndex = -1;

        while (si <= ei) {
            mid = si + (ei - si) / 2;
            int peak = mountainArr.get(mid);
            int next = mid == N - 1 ? -1 : mountainArr.get(mid + 1);
            int prev = mid == 0 ? -1 : mountainArr.get(mid - 1);
            if (prev < peak && next < peak) {
                peakIndex = mid;
                break;
            } else if (prev < peak && peak < next) {
                si = mid + 1;
            } else {
                ei = mid - 1;
            }
        }

        // BS asc
        si = 0;
        ei = peakIndex;

        while (si <= ei) {
            mid = si + (ei - si) / 2;
            int element = mountainArr.get(mid);
            if (element < target) {
                si = mid + 1;
            } else if (element > target) {
                ei = mid - 1;
            } else {
                // Target found;
                return mid;
            }
        }

        // BS desc
        si = peakIndex;
        ei = N - 1;
        while (si <= ei) {
            mid = si + (ei - si) / 2;
            int element = mountainArr.get(mid);
            if (element > target) {
                si = mid + 1;
            } else if (element < target) {
                ei = mid - 1;
            } else {
                // Target found;
                return mid;
            }
        }

        return -1;
    }

}
