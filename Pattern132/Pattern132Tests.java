package Pattern132;

import org.junit.Test;
import static org.junit.Assert.*;

public class Pattern132Tests {

    @Test
    public void testExample1() {
        Pattern132 pattern132 = new Pattern132();
        int[] nums = { 1, 2, 3, 4 };
        boolean expected = false;
        boolean result = pattern132.find132pattern(nums);
        assertEquals(expected, result);
    }

    @Test
    public void testExample2() {
        Pattern132 pattern132 = new Pattern132();
        int[] nums = { 3, 1, 4, 2 };
        boolean expected = true;
        boolean result = pattern132.find132pattern(nums);
        assertEquals(expected, result);
    }

    @Test
    public void testExample3() {
        Pattern132 pattern132 = new Pattern132();
        int[] nums = { -1, 3, 2, 0 };
        boolean expected = true;
        boolean result = pattern132.find132pattern(nums);
        assertEquals(expected, result);
    }

    @Test
    public void testNoPattern() {
        Pattern132 pattern132 = new Pattern132();
        int[] nums = { 1, 2, 2, 1 };
        boolean expected = false;
        boolean result = pattern132.find132pattern(nums);
        assertEquals(expected, result);
    }
}
