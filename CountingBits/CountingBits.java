package CountingBits;

public class CountingBits {

    int[] dp;

    public int[] countBits(int n) {
        this.dp = new int[n + 1];
        int result[] = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            result[i] = getCountAt(i);
            dp[i] = result[i];
        }
        return result;
    }

    private int getCountAt(int n) {
        int bitCounter = 0;
        while (n > 0) {
            if (this.dp[n] != 0)
                return bitCounter + this.dp[n];
            if (n % 2 == 1)
                bitCounter++;
            n = n / 2;
        }
        return bitCounter;
    }

}
