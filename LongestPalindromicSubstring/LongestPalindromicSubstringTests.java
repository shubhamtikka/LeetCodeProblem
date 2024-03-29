package LongestPalindromicSubstring;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LongestPalindromicSubstringTests {

    @Test
    public void testExample1() {
        LongestPalindromicSubstring solution = new LongestPalindromicSubstring();
        String result = solution.longestPalindrome("babad");
        assertEquals("bab", result);
    }

    @Test
    public void testExample2() {
        LongestPalindromicSubstring solution = new LongestPalindromicSubstring();
        String result = solution.longestPalindrome("cbbd");
        assertEquals("bb", result);
    }

    @Test
    public void testAdditional1() {
        LongestPalindromicSubstring solution = new LongestPalindromicSubstring();
        String result = solution.longestPalindrome("racecar");
        assertEquals("racecar", result);
    }

    @Test
    public void testAdditional2() {
        LongestPalindromicSubstring solution = new LongestPalindromicSubstring();
        String result = solution.longestPalindrome("abcde");
        assertEquals("a", result);
    }
}

