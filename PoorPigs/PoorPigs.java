package PoorPigs;

public class PoorPigs {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int testRounds = minutesToTest / minutesToDie;
        int i = 0;
        while (Math.pow(testRounds + 1, i) < buckets) {
            i++;
        }
        return i;
    }
}
