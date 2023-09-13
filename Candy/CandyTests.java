package Candy;

import org.junit.Test;
import static org.junit.Assert.*;

public class CandyTests {

    @Test
    public void testExample1() {
        Candy Candy = new Candy();
        int[] ratings = { 1, 0, 2 };
        int expected = 5;
        int result = Candy.candy(ratings);
        assertEquals(expected, result);
    }

    @Test
    public void testExample2() {
        Candy Candy = new Candy();
        int[] ratings = { 1, 2, 2 };
        int expected = 4;
        int result = Candy.candy(ratings);
        assertEquals(expected, result);
    }

    @Test
    public void testAllEqualRatings() {
        Candy Candy = new Candy();
        int[] ratings = { 2, 2, 2 };
        int expected = 3; // All children get the same number of candies
        int result = Candy.candy(ratings);
        assertEquals(expected, result);
    }

    @Test
    public void testIncreasingRatings() {
        Candy Candy = new Candy();
        int[] ratings = { 1, 2, 3 };
        int expected = 6; // Each child gets one more candy than the previous
        int result = Candy.candy(ratings);
        assertEquals(expected, result);
    }

    @Test
    public void testDecreasingRatings() {
        Candy Candy = new Candy();
        int[] ratings = { 3, 2, 1 };
        int expected = 6; // Each child gets one more candy than the next
        int result = Candy.candy(ratings);
        assertEquals(expected, result);
    }
}
