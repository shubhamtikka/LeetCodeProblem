package KthSymbolInGrammar;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class KthSymbolInGrammarTests {

    @Test
    public void testExample1() {
        KthSymbolInGrammar solution = new KthSymbolInGrammar();
        int result = solution.kthGrammar(1, 1);
        assertEquals(0, result);
    }

    @Test
    public void testExample2() {
        KthSymbolInGrammar solution = new KthSymbolInGrammar();
        int result = solution.kthGrammar(2, 1);
        assertEquals(0, result);
    }

    @Test
    public void testExample3() {
        KthSymbolInGrammar solution = new KthSymbolInGrammar();
        int result = solution.kthGrammar(2, 2);
        assertEquals(1, result);
    }

    @Test
    public void testAdditional1() {
        KthSymbolInGrammar solution = new KthSymbolInGrammar();
        int result = solution.kthGrammar(3, 3);
        assertEquals(1, result);
    }

    @Test
    public void testAdditional2() {
        KthSymbolInGrammar solution = new KthSymbolInGrammar();
        int result = solution.kthGrammar(4, 5);
        assertEquals(1, result);
    }
}
