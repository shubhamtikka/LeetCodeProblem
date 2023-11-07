package EliminateMaximumNumberofMonsters;

import java.util.Arrays;

public class EliminateMaximumNumberofMonsters {
    public int eliminateMaximum(int[] dist, int[] speed) {
        int N = dist.length;
        int count = 0;
        double time[] = new double[N];

        for (int i = 0; i < N; i++) {
            time[i] = (float) dist[i] / speed[i];
        }

        Arrays.sort(time);

        for (int i = 0; i < N; i++) {
            if (time[i] - i <= 0) {
                return count;
            }
            count++;
        }
        return count;

    }

}
