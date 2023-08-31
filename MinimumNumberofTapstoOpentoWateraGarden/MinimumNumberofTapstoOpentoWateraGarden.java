package MinimumNumberofTapstoOpentoWateraGarden;

public class MinimumNumberofTapstoOpentoWateraGarden {
    public int minTaps(int n, int[] ranges) {
        int[] maxReach = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            if (ranges[i] == 0)
                continue;
            int rangeLeft = Math.max(i - ranges[i], 0);
            int rangeRight = Math.min(i + ranges[i], n);
            // System.out.println(i + " " + rangeLeft + " " + rangeRight);
            maxReach[rangeLeft] = Math.min(rangeRight, n);
        }

        int currReach = -1;
        int nextMaxReach = maxReach[0];
        int tapCounter = 0;

        for (int i = 0; i <= n; i++) {

            if (i > nextMaxReach) {
                return -1;
            }

            if (i > currReach) {
                tapCounter++;
                currReach = nextMaxReach;
            }
            nextMaxReach = Math.max(nextMaxReach, maxReach[i]);
        }
        return tapCounter;
    }
}
