package BestTimetoBuyAndSellStockII;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BestTimetoBuyAndSellStockIITest {
    BestTimetoBuyAndSellStockII obj = new BestTimetoBuyAndSellStockII();

    @Test
    public void testMAxProfit1() {

        int[] prices = { 7, 1, 5, 3, 6, 4 };
        int expected = 7;
        int actual = obj.maxProfit(prices);

        assertEquals("Test 1 : Actual:" + actual, expected, actual);
    }

    @Test
    public void testMAxProfit2() {

        int[] prices = { 7, 6, 4, 3, 1 };
        int expected = 0;
        int actual = obj.maxProfit(prices);

        assertEquals("Test 1 : Actual:" + actual, expected, actual);
    }
}
