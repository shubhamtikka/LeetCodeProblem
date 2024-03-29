package PoorPigs;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PoorPigsTests {

    @Test
    public void testExample1() {
        PoorPigs solution = new PoorPigs();
        int result = solution.poorPigs(4, 15, 15);
        assertEquals(2, result);
    }

    @Test
    public void testExample2() {
        PoorPigs solution = new PoorPigs();
        int result = solution.poorPigs(4, 15, 30);
        assertEquals(2, result);
    }

    @Test
    public void testAdditional1() {
        PoorPigs solution = new PoorPigs();
        int result = solution.poorPigs(2, 5, 10);
        assertEquals(1, result);
    }

    @Test
    public void testAdditional2() {
        PoorPigs solution = new PoorPigs();
        int result = solution.poorPigs(1000, 1, 100);
        assertEquals(5, result);
    }
}
