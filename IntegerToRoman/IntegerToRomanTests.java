package IntegerToRoman;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IntegerToRomanTests {
    IntegerToRoman obj = new IntegerToRoman();

    @Test
    public void intToRomanTest1() {
        int num = 3;
        String expected = "III";
        String actual = obj.intToRoman(num);

        assertEquals(expected, actual);
    }

    @Test
    public void intToRomanTest2() {
        int num = 58;
        String expected = "LVIII";
        String actual = obj.intToRoman(num);

        assertEquals(expected, actual);
    }

    @Test
    public void intToRomanTest3() {
        int num = 1994;
        String expected = "MCMXCIV";
        String actual = obj.intToRoman(num);

        assertEquals(expected, actual);
    }
}
