package ValidPalindrome;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ValidPalindromeTests {

    ValidPalindrome obj = new ValidPalindrome();

    @Test
    public void isPalindromeTest1() {
        String s = "A man, a plan, a canal: Panama";
        assertTrue(obj.isPalindrome(s));
    }

    @Test
    public void isPalindromeTest2() {
        String s = "race a car";
        assertFalse(obj.isPalindrome(s));
    }

    @Test
    public void isPalindromeTest3() {
        String s = " ";
        assertTrue(obj.isPalindrome(s));
    }

}
