import org.junit.Test;
import static org.junit.Assert.*;

public class CountAllValidOrdersTests {

    @Test
    public void testExample1() {
        CountAllValidOrders orderCounter = new CountAllValidOrders();
        int n = 1;
        int expected = 1;
        int result = orderCounter.countOrders(n);
        assertEquals(expected, result);
    }

    @Test
    public void testExample2() {
        CountAllValidOrders orderCounter = new CountAllValidOrders();
        int n = 2;
        int expected = 6;
        int result = orderCounter.countOrders(n);
        assertEquals(expected, result);
    }

    @Test
    public void testExample3() {
        CountAllValidOrders orderCounter = new CountAllValidOrders();
        int n = 3;
        int expected = 90;
        int result = orderCounter.countOrders(n);
        assertEquals(expected, result);
    }

    @Test
    public void testZeroOrders() {
        CountAllValidOrders orderCounter = new CountAllValidOrders();
        int n = 0;
        int expected = 1; // There is one valid empty order
        int result = orderCounter.countOrders(n);
        assertEquals(expected, result);
    }

    @Test
    public void testLargeNumberOfOrders() {
        CountAllValidOrders orderCounter = new CountAllValidOrders();
        int n = 10;
        int result = orderCounter.countOrders(n);
        // Validate that the result is within the modulo 10^9 + 7 range
        assertTrue(result >= 0);
    }
}
