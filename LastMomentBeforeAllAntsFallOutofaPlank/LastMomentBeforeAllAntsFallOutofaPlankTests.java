package LastMomentBeforeAllAntsFallOutofaPlank;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LastMomentBeforeAllAntsFallOutofaPlankTests {

    @Test
    public void testExample1() {
        LastMomentBeforeAllAntsFallOutofaPlank solution = new LastMomentBeforeAllAntsFallOutofaPlank();
        int n = 4;
        int[] left = { 4, 3 };
        int[] right = { 0, 1 };
        int result = solution.getLastMoment(n, left, right);
        int expected = 4;
        assertEquals(expected, result);
    }

    @Test
    public void testExample2() {
        LastMomentBeforeAllAntsFallOutofaPlank solution = new LastMomentBeforeAllAntsFallOutofaPlank();
        int n = 7;
        int[] left = {};
        int[] right = { 0, 1, 2, 3, 4, 5, 6, 7 };
        int result = solution.getLastMoment(n, left, right);
        int expected = 7;
        assertEquals(expected, result);
    }

    @Test
    public void testExample3() {
        LastMomentBeforeAllAntsFallOutofaPlank solution = new LastMomentBeforeAllAntsFallOutofaPlank();
        int n = 7;
        int[] left = { 0, 1, 2, 3, 4, 5, 6, 7 };
        int[] right = {};
        int result = solution.getLastMoment(n, left, right);
        int expected = 7;
        assertEquals(expected, result);
    }

}
