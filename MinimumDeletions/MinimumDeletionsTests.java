package MinimumDeletions;

import org.junit.Test;
import static org.junit.Assert.*;

public class MinimumDeletionsTests {

    @Test
    public void testExample1() {
        MinimumDeletions deletions = new MinimumDeletions();
        String s = "aab";
        int expected = 0;
        int result = deletions.minDeletions(s);
        assertEquals(expected, result);
    }

    @Test
    public void testExample2() {
        MinimumDeletions deletions = new MinimumDeletions();
        String s = "aaabbbcc";
        int expected = 2;
        int result = deletions.minDeletions(s);
        assertEquals(expected, result);
    }

    @Test
    public void testExample3() {
        MinimumDeletions deletions = new MinimumDeletions();
        String s = "ceabaacb";
        int expected = 2;
        int result = deletions.minDeletions(s);
        assertEquals(expected, result);
    }

    @Test
    public void testAllUniqueCharacters() {
        MinimumDeletions deletions = new MinimumDeletions();
        String s = "abcdefg";
        int expected = 6;
        int result = deletions.minDeletions(s);
        assertEquals(expected, result);
    }

    @Test
    public void testAllSameCharacters() {
        MinimumDeletions deletions = new MinimumDeletions();
        String s = "aaa";
        int expected = 0;
        int result = deletions.minDeletions(s);
        assertEquals(expected, result);
    }
}
