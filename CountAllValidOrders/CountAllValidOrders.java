public class CountAllValidOrders {

    public int countOrders(int n) {
        int mod = 1000000007;
        long ans = 1;
        for (int i = 2; i <= n; i++) {
            ans = (i * (i * 2 - 1) * ans) % mod;
        }
        return (int) ans;
    }
}
