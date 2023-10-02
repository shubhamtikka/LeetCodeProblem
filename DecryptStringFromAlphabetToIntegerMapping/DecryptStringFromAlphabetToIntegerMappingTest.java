package DecryptStringFromAlphabetToIntegerMapping;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DecryptStringFromAlphabetToIntegerMappingTest {

    DecryptStringFromAlphabetToIntegerMapping obj = new DecryptStringFromAlphabetToIntegerMapping();

    @Test
    public void freqAlphabetsTest1() {

        String input = "10#11#12";
        String expected = obj.freqAlphabets(input);
        String actual = "jkab";
        assertEquals(expected, actual);
    }

    @Test
    public void freqAlphabetsTest2() {

        String input = "1326#";
        String expected = obj.freqAlphabets(input);
        String actual = "acz";
        assertEquals(expected, actual);
    }

}
