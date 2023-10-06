package IntegerBreak;

public class IntegerBreak {
    public int integerBreak(int n) {
        if (n < 4)
            return n - 1;

        int productOf3s = (int) Math.pow(3, n / 3);

        if (n % 3 == 1) {
            return (productOf3s / 3) * 4;
        } else if (n % 3 == 2) {
            return productOf3s * 2;
        }

        return productOf3s;

    }

}
