package FindtheWinnerofanArrayGame;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FindtheWinnerofanArrayGameTests {

    @Test
    public void testExample1() {
        FindtheWinnerofanArrayGame solution = new FindtheWinnerofanArrayGame();
        int[] arr = { 2, 1, 3, 5, 4, 6, 7 };
        int k = 2;
        int result = solution.getWinner(arr, k);
        int expected = 5;
        assertEquals(expected, result);
    }

    @Test
    public void testExample2() {
        FindtheWinnerofanArrayGame solution = new FindtheWinnerofanArrayGame();
        int[] arr = { 3, 2, 1 };
        int k = 10;
        int result = solution.getWinner(arr, k);
        int expected = 3;
        assertEquals(expected, result);
    }

    @Test
    public void testAdditionalCase() {
        FindtheWinnerofanArrayGame solution = new FindtheWinnerofanArrayGame();
        int[] arr = { 5, 4, 3, 2, 1 };
        int k = 3;
        int result = solution.getWinner(arr, k);
        int expected = 5;
        assertEquals(expected, result);
    }

    @Test
    public void testLargerK() {
        FindtheWinnerofanArrayGame solution = new FindtheWinnerofanArrayGame();
        int[] arr = { 10, 20, 30, 40, 50 };
        int k = 100;
        int result = solution.getWinner(arr, k);
        int expected = 50;
        assertEquals(expected, result);
    }
}
