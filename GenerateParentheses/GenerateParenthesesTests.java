package GenerateParentheses;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

import java.util.List;

public class GenerateParenthesesTests {

    @Test
    public void testExample1() {
        GenerateParentheses generateParentheses = new GenerateParentheses();
        int n = 3;
        List<String> expected = List.of("((()))", "(()())", "(())()", "()(())", "()()()");
        List<String> result = generateParentheses.generateParenthesis(n);
        assertTrue(result.containsAll(expected));
        assertTrue(expected.containsAll(result));
    }

    @Test
    public void testExample2() {
        GenerateParentheses generateParentheses = new GenerateParentheses();
        int n = 1;
        List<String> expected = List.of("()");
        List<String> result = generateParentheses.generateParenthesis(n);
        assertTrue(result.containsAll(expected));
        assertTrue(expected.containsAll(result));
    }

    @Test
    public void testEdgeCase() {
        GenerateParentheses generateParentheses = new GenerateParentheses();
        int n = 0;
        List<String> expected = List.of("");
        List<String> result = generateParentheses.generateParenthesis(n);
        assertTrue(result.containsAll(expected));
        assertTrue(expected.containsAll(result));
    }
}
