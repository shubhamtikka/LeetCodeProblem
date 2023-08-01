package CountingBits;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class CountingBitsTest {

    CountingBits countingBits = new CountingBits();

    @Test
    public void test1() {
        int n = 5;
        int[] expected = { 0, 1, 1, 2, 1, 2 };
        int[] actual = countingBits.countBits(n);
        for (int i : actual) {
            System.out.println(i);
        }
        assertArrayEquals("", expected, actual);
    }

    @Test
    public void test2() {
        int n = 2;
        int[] expected = { 0, 1, 1 };
        int[] actual = countingBits.countBits(n);
        for (int i : actual) {
            System.out.println(i);
        }
        assertArrayEquals("", expected, actual);
    }
}
