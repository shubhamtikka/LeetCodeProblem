package BuildArray;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BuildArrayTests {

    @Test
    public void testBuildArrayExample1() {
        BuildArray solution = new BuildArray();
        int n = 2, m = 3, k = 1;
        int expected = 6;
        int result = solution.numOfArrays(n, m, k);
        assertEquals(expected, result);
    }

    @Test
    public void testBuildArrayExample2() {
        BuildArray solution = new BuildArray();
        int n = 5, m = 2, k = 3;
        int expected = 0;
        int result = solution.numOfArrays(n, m, k);
        assertEquals(expected, result);
    }

    @Test
    public void testBuildArrayExample3() {
        BuildArray solution = new BuildArray();
        int n = 9, m = 1, k = 1;
        int expected = 1;
        int result = solution.numOfArrays(n, m, k);
        assertEquals(expected, result);
    }

}
