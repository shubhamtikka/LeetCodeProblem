package BuildanArrayWithStackOperations;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

public class BuildanArrayWithStackOperationsTests {

    @Test
    public void testExample1() {
        BuildanArrayWithStackOperations solution = new BuildanArrayWithStackOperations();
        int[] target = { 1, 3 };
        int n = 3;
        List<String> result = solution.buildArray(target, n);
        List<String> expected = Arrays.asList("Push", "Push", "Pop", "Push");
        assertEquals(expected, result);
    }

    @Test
    public void testExample2() {
        BuildanArrayWithStackOperations solution = new BuildanArrayWithStackOperations();
        int[] target = { 1, 2, 3 };
        int n = 3;
        List<String> result = solution.buildArray(target, n);
        List<String> expected = Arrays.asList("Push", "Push", "Push");
        assertEquals(expected, result);
    }

    @Test
    public void testExample3() {
        BuildanArrayWithStackOperations solution = new BuildanArrayWithStackOperations();
        int[] target = { 1, 2 };
        int n = 4;
        List<String> result = solution.buildArray(target, n);
        List<String> expected = Arrays.asList("Push", "Push");
        assertEquals(expected, result);
    }
}
