package PowerOfFour;

import org.junit.Test;
import static org.junit.Assert.*;

public class PowerOfFourTests {

    @Test
    public void testExample1() {
        PowerOfFour solution = new PowerOfFour();
        assertTrue(solution.isPowerOfFour(16));
    }

    @Test
    public void testExample2() {
        PowerOfFour solution = new PowerOfFour();
        assertFalse(solution.isPowerOfFour(5));
    }

    @Test
    public void testExample3() {
        PowerOfFour solution = new PowerOfFour();
        assertTrue(solution.isPowerOfFour(1));
    }

    @Test
    public void testZero() {
        PowerOfFour solution = new PowerOfFour();
        assertFalse(solution.isPowerOfFour(0));
    }

    @Test
    public void testNegativeNumber() {
        PowerOfFour solution = new PowerOfFour();
        assertFalse(solution.isPowerOfFour(-16));
    }

    @Test
    public void testLargeNumber() {
        PowerOfFour solution = new PowerOfFour();
        assertFalse(solution.isPowerOfFour(1000000));
    }

    @Test
    public void testPowerOfFour() {
        PowerOfFour solution = new PowerOfFour();
        assertTrue(solution.isPowerOfFour(4));
        assertTrue(solution.isPowerOfFour(64));
        assertTrue(solution.isPowerOfFour(256));
    }
}
