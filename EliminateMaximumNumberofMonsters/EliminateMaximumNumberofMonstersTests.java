package EliminateMaximumNumberofMonsters;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class EliminateMaximumNumberofMonstersTests {

    @Test
    public void testExample1() {
        EliminateMaximumNumberofMonsters solution = new EliminateMaximumNumberofMonsters();
        int[] dist = { 1, 3, 4 };
        int[] speed = { 1, 1, 1 };
        int result = solution.eliminateMaximum(dist, speed);
        assertEquals(3, result);
    }

    @Test
    public void testExample2() {
        EliminateMaximumNumberofMonsters solution = new EliminateMaximumNumberofMonsters();
        int[] dist = { 1, 1, 2, 3 };
        int[] speed = { 1, 1, 1, 1 };
        int result = solution.eliminateMaximum(dist, speed);
        assertEquals(1, result);
    }

    @Test
    public void testExample3() {
        EliminateMaximumNumberofMonsters solution = new EliminateMaximumNumberofMonsters();
        int[] dist = { 3, 2, 4 };
        int[] speed = { 5, 3, 2 };
        int result = solution.eliminateMaximum(dist, speed);
        assertEquals(1, result);
    }

    @Test
    public void testAllMonstersEliminated() {
        EliminateMaximumNumberofMonsters solution = new EliminateMaximumNumberofMonsters();
        int[] dist = { 1, 2, 3 };
        int[] speed = { 3, 2, 1 };
        int result = solution.eliminateMaximum(dist, speed);
        assertEquals(1, result);
    }

    @Test
    public void testAllMonstersReachedCity() {
        EliminateMaximumNumberofMonsters solution = new EliminateMaximumNumberofMonsters();
        int[] dist = { 5, 4, 3 };
        int[] speed = { 1, 2, 3 };
        int result = solution.eliminateMaximum(dist, speed);
        assertEquals(3, result);
    }
}
