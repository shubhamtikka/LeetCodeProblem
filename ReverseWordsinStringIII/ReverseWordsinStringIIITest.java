package ReverseWordsinStringIII;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReverseWordsinStringIIITest {

    ReverseWordsinStringIII reverseWordsinStrinIIIObj = new ReverseWordsinStringIII();

    @Test
    public void testReverseWords1() {
        String s = "Let's take LeetCode contest";
        String expectedString = "s'teL ekat edoCteeL tsetnoc";
        String actualString = reverseWordsinStrinIIIObj.reverseWords(s);

        assertEquals(expectedString, actualString);

    }

    @Test
    public void testReverseWords2() {
        String s = "God Ding";
        String expectedString = "doG gniD";
        String actualString = reverseWordsinStrinIIIObj.reverseWords(s);

        assertEquals(expectedString, actualString);

    }

    @Test
    public void testReverseWords3() {
        String s = "God Ding a";
        String expectedString = "doG gniD a";
        String actualString = reverseWordsinStrinIIIObj.reverseWords(s);

        assertEquals(expectedString, actualString);

    }

    @Test
    public void testReverseWords4() {
        String s = "God";
        String expectedString = "doG";
        String actualString = reverseWordsinStrinIIIObj.reverseWords(s);

        assertEquals(expectedString, actualString);

    }

    @Test
    public void testReverseWords5() {
        String s = "";
        String expectedString = "";
        String actualString = reverseWordsinStrinIIIObj.reverseWords(s);

        assertEquals(expectedString, actualString);

    }
}
