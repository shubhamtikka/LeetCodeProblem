package Subsets;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.junit.Test;

public class SubsetsTests {

    @Test
    public void testSubsets() {

        Subsets obj = new Subsets();

        int[] nums = { 1, 2, 3 };
        Integer[][] expectedArr = { {}, { 1 }, { 2 }, { 1, 2 }, { 3 }, { 1, 3 }, { 2, 3 }, { 1, 2, 3 } };
        Set<List<Integer>> expected = Arrays.stream(expectedArr)
                .map(Arrays::asList)
                .collect(Collectors.toSet());

        List<List<Integer>> actList = obj.subsets(nums);

        assertEquals(expected.size(), actList.size());

        for (List<Integer> list : actList) {
            assertTrue(expected.contains(list));
        }

    }
}
