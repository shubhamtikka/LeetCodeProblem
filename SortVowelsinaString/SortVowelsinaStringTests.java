package SortVowelsinaString;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SortVowelsinaStringTests {

    @Test
    public void testExample1() {
        SortVowelsinaString solution = new SortVowelsinaString();
        String s = "lEetcOde";
        String result = solution.sortVowels(s);
        assertEquals("lEOtcede", result);
    }

    @Test
    public void testExample2() {
        SortVowelsinaString solution = new SortVowelsinaString();
        String s = "lYmpH";
        String result = solution.sortVowels(s);
        assertEquals("lYmpH", result);
    }

    @Test
    public void testAllConsonants() {
        SortVowelsinaString solution = new SortVowelsinaString();
        String s = "bcdfghjklmnpqrstvwxyz";
        String result = solution.sortVowels(s);
        assertEquals("bcdfghjklmnpqrstvwxyz", result);
    }

    @Test
    public void testAllVowels() {
        SortVowelsinaString solution = new SortVowelsinaString();
        String s = "aeiouAEIOU";
        String result = solution.sortVowels(s);
        assertEquals("AEIOUaeiou", result);
    }

}
