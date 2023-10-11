package NumberOfFlowersInBloom;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class NumberOfFlowersInBloomTests {

    @Test
    public void testNumberOfFlowersInBloomExample1() {
        NumberOfFlowersInBloom solution = new NumberOfFlowersInBloom();
        int[][] flowers = { { 1, 6 }, { 3, 7 }, { 9, 12 }, { 4, 13 } };
        int[] people = { 2, 3, 7, 11 };
        int[] expected = { 1, 2, 2, 2 };
        int[] result = solution.fullBloomFlowers(flowers, people);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testNumberOfFlowersInBloomExample2() {
        NumberOfFlowersInBloom solution = new NumberOfFlowersInBloom();
        int[][] flowers = { { 1, 10 }, { 3, 3 } };
        int[] people = { 3, 3, 2 };
        int[] expected = { 2, 2, 1 };
        int[] result = solution.fullBloomFlowers(flowers, people);
        assertArrayEquals(expected, result);
    }

}
