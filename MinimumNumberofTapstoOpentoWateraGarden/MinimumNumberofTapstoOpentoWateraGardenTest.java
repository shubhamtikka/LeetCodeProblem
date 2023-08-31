package MinimumNumberofTapstoOpentoWateraGarden;

import org.junit.Test;
import static org.junit.Assert.*;

public class MinimumNumberofTapstoOpentoWateraGardenTest {

    @Test
    public void testExample1() {
        MinimumNumberofTapstoOpentoWateraGarden waterGarden = new MinimumNumberofTapstoOpentoWateraGarden();
        int n = 5;
        int[] ranges = { 3, 4, 1, 1, 0, 0 };
        int expected = 1;
        int result = waterGarden.minTaps(n, ranges);
        assertEquals(expected, result);
    }

    @Test
    public void testExample2() {
        MinimumNumberofTapstoOpentoWateraGarden waterGarden = new MinimumNumberofTapstoOpentoWateraGarden();
        int n = 3;
        int[] ranges = { 0, 0, 0, 0 };
        int expected = -1;
        int result = waterGarden.minTaps(n, ranges);
        assertEquals(expected, result);
    }

    @Test
    public void testComplexGarden() {
        MinimumNumberofTapstoOpentoWateraGarden waterGarden = new MinimumNumberofTapstoOpentoWateraGarden();
        int n = 7;
        int[] ranges = { 0, 0, 2, 0, 0, 0, 3, 0 };
        int expected = 2;
        int result = waterGarden.minTaps(n, ranges);
        assertEquals(expected, result);
    }

    @Test
    public void testComplexGarden2() {
        MinimumNumberofTapstoOpentoWateraGarden waterGarden = new MinimumNumberofTapstoOpentoWateraGarden();
        int n = 7;
        int[] ranges = { 1, 2, 1, 0, 2, 1, 0, 1 };
        int expected = 3;
        int result = waterGarden.minTaps(n, ranges);
        assertEquals(expected, result);
    }
}
