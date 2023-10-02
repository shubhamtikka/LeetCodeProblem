package ExtraCharactersInAString;

import org.junit.Test;
import static org.junit.Assert.*;

public class ExtraCharactersInAStringTests {

    @Test
    public void testExample1() {
        ExtraCharactersInAString stringProcessor = new ExtraCharactersInAString();
        String s = "leetscode";
        String[] dictionary = { "leet", "code", "leetcode" };
        int expected = 1;
        int result = stringProcessor.minExtraChar(s, dictionary);
        assertEquals(expected, result);
    }

    @Test
    public void testEmptyString() {
        ExtraCharactersInAString stringProcessor = new ExtraCharactersInAString();
        String s = "";
        String[] dictionary = { "hello", "world" };
        int expected = 0; // No extra characters
        int result = stringProcessor.minExtraChar(s, dictionary);
        assertEquals(expected, result);
    }

    @Test
    public void testDictionaryEmpty() {
        ExtraCharactersInAString stringProcessor = new ExtraCharactersInAString();
        String s = "example";
        String[] dictionary = {};
        int expected = 7; // All characters in s are extra
        int result = stringProcessor.minExtraChar(s, dictionary);
        assertEquals(expected, result);
    }

    @Test
    public void testExample3() {
        ExtraCharactersInAString stringProcessor = new ExtraCharactersInAString();
        String s = "sayhelloworld";
        String[] dictionary = { "hello", "world" };
        int expected = 3; // All characters in s are extra
        int result = stringProcessor.minExtraChar(s, dictionary);
        assertEquals(expected, result);
    }

    @Test
    public void testExample4() {
        ExtraCharactersInAString stringProcessor = new ExtraCharactersInAString();
        String s = "dwmodizxvvbosxxw";
        String[] dictionary = { "ox", "lb", "diz", "gu", "v", "ksv", "o", "nuq", "r", "txhe", "e", "wmo", "cehy",
                "tskz", "ds", "kzbu" };
        int expected = 7; // All characters in s are extra
        int result = stringProcessor.minExtraChar(s, dictionary);
        assertEquals(expected, result);
    }

    @Test
    public void testExample5() {
        ExtraCharactersInAString stringProcessor = new ExtraCharactersInAString();
        String s = "kevlplxozaizdhxoimmraiakbak";
        String[] dictionary = { "yv", "bmab", "hv", "bnsll", "mra", "jjqf", "g", "aiyzi", "ip", "pfctr", "flr", "ybbcl",
                "biu", "ke", "lpl", "iak", "pirua", "ilhqd", "zdhx", "fux", "xaw", "pdfvt", "xf", "t", "wq", "r",
                "cgmud", "aokas", "xv", "jf", "cyys", "wcaz", "rvegf", "ysg", "xo", "uwb", "lw", "okgk", "vbmi", "v",
                "mvo", "fxyx", "ad", "e" };
        int expected = 9; // All characters in s are extra
        int result = stringProcessor.minExtraChar(s, dictionary);
        assertEquals(expected, result);
    }
}
