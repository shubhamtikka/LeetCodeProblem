package ValidParentheses;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ValidParenthesesTest {

    ValidParentheses validParenthesesObj = new ValidParentheses();

    @Test
    public void isValidTest1() {
        String inputStr = "()";
        assertTrue(validParenthesesObj.isValid(inputStr));
    }

    @Test
    public void isValidTest2() {
        String inputStr = "()[]{}";
        assertTrue(validParenthesesObj.isValid(inputStr));
    }

    @Test
    public void isValidTest3() {
        String inputStr = "(]";
        assertFalse(validParenthesesObj.isValid(inputStr));
    }

    @Test
    public void isValidTest4() {
        String inputStr = "([[]]]]";
        assertFalse(validParenthesesObj.isValid(inputStr));
    }

    @Test
    public void isValidTest5() {
        String inputStr = "([[]]]])";
        assertFalse(validParenthesesObj.isValid(inputStr));
    }

}
