package LongestSubstringWithoutRepeatingCharacters;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LongestSubstringWithoutRepeatingCharsTest {

    LongestSubstringWithoutRepeatingChars obj = new LongestSubstringWithoutRepeatingChars();

    @Test
    public void testLongestSubstr1() {
        String s = "abcabcbb";
        int actual = obj.lengthOfLongestSubstring(s);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void testLongestSubstr2() {
        String s = "pwwkew";
        int actual = obj.lengthOfLongestSubstring(s);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void testLongestSubstr3() {
        String s = "bbbb";
        int actual = obj.lengthOfLongestSubstring(s);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void testLongestSubstr4() {
        String s = "bbqbb";
        int actual = obj.lengthOfLongestSubstring(s);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void testLongestSubstr5() {
        String s = "aa";
        int actual = obj.lengthOfLongestSubstring(s);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void testLongestSubstr6() {
        String s = "qqq";
        int actual = obj.lengthOfLongestSubstring(s);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void testLongestSubstr7() {
        String s = "abba";
        int actual = obj.lengthOfLongestSubstring(s);
        int expected = 2;
        assertEquals(expected, actual);
    }

}
