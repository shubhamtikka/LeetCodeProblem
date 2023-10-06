package IntegerBreak;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegerBreakTests {

    @Test
    public void testIntegerBreakWithTwo() {
        IntegerBreak solution = new IntegerBreak();
        int n = 2;
        int expected = 1;
        int result = solution.integerBreak(n);
        assertEquals(expected, result);
    }

    @Test
    public void testIntegerBreakWithTen() {
        IntegerBreak solution = new IntegerBreak();
        int n = 10;
        int expected = 36;
        int result = solution.integerBreak(n);
        assertEquals(expected, result);
    }

    @Test
    public void testIntegerBreakWithThree() {
        IntegerBreak solution = new IntegerBreak();
        int n = 3;
        int expected = 2;
        int result = solution.integerBreak(n);
        assertEquals(expected, result);
    }

    @Test
    public void testIntegerBreakWithEight() {
        IntegerBreak solution = new IntegerBreak();
        int n = 8;
        int expected = 18;
        int result = solution.integerBreak(n);
        assertEquals(expected, result);
    }
}
