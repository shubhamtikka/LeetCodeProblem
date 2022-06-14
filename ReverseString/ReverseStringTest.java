package ReverseString;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class ReverseStringTest {

    ReverseString reverseStringObj = new ReverseString();

    @Test
    public void testReverString1() {
        char[] s = new char[] { 'h', 'e', 'l', 'l', 'o' };
        char[] expectedOutput = { 'o', 'l', 'l', 'e', 'h' };
        reverseStringObj.reverseString(s);
        assertArrayEquals(s, expectedOutput);
    }

    @Test
    public void testReverString2() {
        char[] s = new char[] { 'h', 'e' };
        char[] expectedOutput = { 'e', 'h' };
        reverseStringObj.reverseString(s);
        assertArrayEquals(s, expectedOutput);
    }

    @Test
    public void testReverString3() {
        char[] s = new char[] {};
        char[] expectedOutput = {};
        reverseStringObj.reverseString(s);
        assertArrayEquals(s, expectedOutput);
    }

    @Test
    public void testReverString4() {
        char[] s = new char[] { 'h' };
        char[] expectedOutput = { 'h' };
        reverseStringObj.reverseString(s);
        assertArrayEquals(s, expectedOutput);
    }
}
