package NumberofWaystoStayinTheSamePlaceAfterSomeSteps;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class NumberofWaystoStayinTheSamePlaceAfterSomeStepsTest {

    @Test
    public void testExample1() {
        NumberofWaystoStayinTheSamePlaceAfterSomeSteps solution = new NumberofWaystoStayinTheSamePlaceAfterSomeSteps();
        int steps = 3;
        int arrLen = 2;
        int expected = 4;
        int result = solution.numWays(steps, arrLen);
        assertEquals(expected, result);
    }

    @Test
    public void testExample2() {
        NumberofWaystoStayinTheSamePlaceAfterSomeSteps solution = new NumberofWaystoStayinTheSamePlaceAfterSomeSteps();
        int steps = 2;
        int arrLen = 4;
        int expected = 2;
        int result = solution.numWays(steps, arrLen);
        assertEquals(expected, result);
    }

    @Test
    public void testExample3() {
        NumberofWaystoStayinTheSamePlaceAfterSomeSteps solution = new NumberofWaystoStayinTheSamePlaceAfterSomeSteps();
        int steps = 4;
        int arrLen = 2;
        int expected = 8;
        int result = solution.numWays(steps, arrLen);
        assertEquals(expected, result);
    }

    @Test
    public void testMinimumValues() {
        NumberofWaystoStayinTheSamePlaceAfterSomeSteps solution = new NumberofWaystoStayinTheSamePlaceAfterSomeSteps();
        int steps = 1;
        int arrLen = 1;
        int expected = 1;
        int result = solution.numWays(steps, arrLen);
        assertEquals(expected, result);
    }
}
