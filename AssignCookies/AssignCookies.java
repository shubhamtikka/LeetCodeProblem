package AssignCookies;

import java.util.Arrays;

public class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        int count = 0;
        int gi = 0;
        int si = 0;

        Arrays.sort(g);
        Arrays.sort(s);

        while (si < s.length && gi < g.length) {
            if (s[si] >= g[gi]) {
                gi++;
                count++;
            }
            si++;

        }

        return count;
    }
}
