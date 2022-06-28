package PermutationInString;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PermutationInStringTest {

    PermutationInString permutationInStringObj = new PermutationInString();

    @Test
    public void testPermutationInString1() {
        String s1 = "ab";
        String s2 = "eidbaooo";
        assertTrue(permutationInStringObj.checkInclusion(s1, s2));
    }

    @Test
    public void testPermutationInString2() {
        String s1 = "ab";
        String s2 = "eidboaoo";
        assertFalse(permutationInStringObj.checkInclusion(s1, s2));
    }

    @Test
    public void testPermutationInString3() {
        String s1 = "ab";
        String s2 = "ba";
        assertTrue(permutationInStringObj.checkInclusion(s1, s2));
    }

    @Test
    public void testPermutationInString4() {
        String s1 = "abc";
        String s2 = "dhfbac";
        assertTrue(permutationInStringObj.checkInclusion(s1, s2));
    }

    @Test
    public void testPermutationInString5() {
        String s1 = "abc";
        String s2 = "bacdhf";
        assertTrue(permutationInStringObj.checkInclusion(s1, s2));
    }

    @Test
    public void testPermutationInString6() {
        String s1 = "a";
        String s2 = "bacdhf";
        assertTrue(permutationInStringObj.checkInclusion(s1, s2));
    }

    @Test
    public void testPermutationInString7() {
        String s1 = "adc";
        String s2 = "cda";
        assertTrue(permutationInStringObj.checkInclusion(s1, s2));
    }

}
