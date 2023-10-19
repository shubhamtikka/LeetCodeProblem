package BackspaceStringCompare;

import org.junit.Test;
import static org.junit.Assert.*;

public class BackspaceStringCompareTest {

    @Test
    public void testBackspaceCompareWithEqualStrings() {
        BackspaceStringCompare solution = new BackspaceStringCompare();
        assertTrue(solution.backspaceCompare("ab#c", "ad#c"));
    }

    @Test
    public void testBackspaceCompareWithEmptyStrings() {
        BackspaceStringCompare solution = new BackspaceStringCompare();
        assertTrue(solution.backspaceCompare("ab##", "c#d#"));
    }

    @Test
    public void testBackspaceCompareWithUnequalStrings() {
        BackspaceStringCompare solution = new BackspaceStringCompare();
        assertFalse(solution.backspaceCompare("a#c", "b"));
    }

    @Test
    public void testBackspaceCompareWithExtraBackspaces() {
        BackspaceStringCompare solution = new BackspaceStringCompare();
        assertTrue(solution.backspaceCompare("xywrrmp", "xywrrmu#p"));
    }
}
