package PeakIndexInMountainArray;

public class PeakIndexInMountainArray {
    public int peakIndexInMountainArray(int[] arr) {

        int N = arr.length;
        // find peak
        int si = 0, ei = N - 1, mid = 0;
        int peakIndex = -1;

        while (si <= ei) {
            mid = si + (ei - si) / 2;
            int peak = arr[mid];
            int next = mid == N - 1 ? -1 : arr[mid + 1];
            int prev = mid == 0 ? -1 : arr[mid - 1];
            if (prev < peak && next < peak) {
                peakIndex = mid;
                break;
            } else if (prev < peak && peak < next) {
                si = mid + 1;
            } else {
                ei = mid - 1;
            }
        }
        return peakIndex;
    }

}
