package AssignCookies;

import org.junit.Test;
import static org.junit.Assert.*;

public class AssignCookiesTest {

    AssignCookies assignCookies = new AssignCookies();

    @Test
    public void testExample1() {
        int[] g = { 1, 2, 3 };
        int[] s = { 1, 1 };
        int expected = 1;
        int result = assignCookies.findContentChildren(g, s);
        assertEquals(expected, result);
    }

    @Test
    public void testExample2() {
        int[] g = { 1, 2 };
        int[] s = { 1, 2, 3 };
        int expected = 2;
        int result = assignCookies.findContentChildren(g, s);
        assertEquals(expected, result);
    }

    @Test
    public void testEmptyInput() {
        int[] g = {};
        int[] s = {};
        int expected = 0;
        int result = assignCookies.findContentChildren(g, s);
        assertEquals(expected, result);
    }

    @Test
    public void testNoCookies() {
        int[] g = { 1, 2, 3 };
        int[] s = {};
        int expected = 0;
        int result = assignCookies.findContentChildren(g, s);
        assertEquals(expected, result);
    }

    @Test
    public void testNoChildren() {
        int[] g = {};
        int[] s = { 1, 2, 3 };
        int expected = 0;
        int result = assignCookies.findContentChildren(g, s);
        assertEquals(expected, result);
    }
}
