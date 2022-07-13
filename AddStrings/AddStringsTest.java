package AddStrings;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AddStringsTest {

    AddStrings addStringsObj = new AddStrings();

    @Test
    public void testAddStrings1() {
        String num1 = "11";
        String num2 = "123";
        String expectedOutput = "134";
        String actualOutput = addStringsObj.addStrings(num1, num2);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testAddStrings2() {
        String num1 = "1";
        String num2 = "123";
        String expectedOutput = "124";
        String actualOutput = addStringsObj.addStrings(num1, num2);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testAddStrings3() {
        String num1 = "0";
        String num2 = "123";
        String expectedOutput = "123";
        String actualOutput = addStringsObj.addStrings(num1, num2);
        assertEquals(expectedOutput, actualOutput);
    }

}
