package CountVowelsPermutation;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CountVowelsPermutationTests {

    @Test
    public void testExample1() {
        CountVowelsPermutation solution = new CountVowelsPermutation();
        int result = solution.countVowelPermutation(1);
        assertEquals(5, result);
    }

    @Test
    public void testExample2() {
        CountVowelsPermutation solution = new CountVowelsPermutation();
        int result = solution.countVowelPermutation(2);
        assertEquals(10, result);
    }

    @Test
    public void testExample3() {
        CountVowelsPermutation solution = new CountVowelsPermutation();
        int result = solution.countVowelPermutation(5);
        assertEquals(68, result);
    }

    @Test
    public void testAdditional1() {
        CountVowelsPermutation solution = new CountVowelsPermutation();
        int result = solution.countVowelPermutation(3);
        assertEquals(19, result);
    }

    @Test
    public void testAdditional2() {
        CountVowelsPermutation solution = new CountVowelsPermutation();
        int result = solution.countVowelPermutation(10);
        assertEquals(9850, result);
    }
}
