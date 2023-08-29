package MinimumPenaltyforShop;

import org.junit.Test;
import static org.junit.Assert.*;

public class MinimumPenaltyforShopTest {

    @Test
    public void testExample1() {
        MinimumPenaltyforShop shop = new MinimumPenaltyforShop();
        String customers = "YYNY";
        int expected = 2;
        int result = shop.bestClosingTime(customers);
        assertEquals(expected, result);
    }

    @Test
    public void testExample2() {
        MinimumPenaltyforShop shop = new MinimumPenaltyforShop();
        String customers = "NNNNN";
        int expected = 0;
        int result = shop.bestClosingTime(customers);
        assertEquals(expected, result);
    }

    @Test
    public void testExample3() {
        MinimumPenaltyforShop shop = new MinimumPenaltyforShop();
        String customers = "YYYY";
        int expected = 4;
        int result = shop.bestClosingTime(customers);
        assertEquals(expected, result);
    }

    @Test
    public void testAllClosed() {
        MinimumPenaltyforShop shop = new MinimumPenaltyforShop();
        String customers = "NNNN";
        int expected = 0;
        int result = shop.bestClosingTime(customers);
        assertEquals(expected, result);
    }

    @Test
    public void testAllOpen() {
        MinimumPenaltyforShop shop = new MinimumPenaltyforShop();
        String customers = "YYYYY";
        int expected = 5;
        int result = shop.bestClosingTime(customers);
        assertEquals(expected, result);
    }
}
