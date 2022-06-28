/*
 * 
 * Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.
 * In other words, return true if one of s1's permutations is the substring of s2.
 * 
 * @param String s1, String S2
 * @return boolean 
 */

package PermutationInString;

public class PermutationInString {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length())
            return false;
        int[] s1Frequency = new int[26];
        int[] s2SubstrFrequency = new int[26];
        int start = 0, end = s1.length() - 1;

        for (int i = 0; i < s1.length(); i++) {
            s1Frequency[s1.charAt(i) - 97]++;
        }
        for (int i = 0; i < s1.length(); i++) {
            s2SubstrFrequency[s2.charAt(i) - 97]++;
        }
        if (isArrEquals(s1Frequency, s2SubstrFrequency)) {
            return true;
        }

        while (end < s2.length() - 1) {

            s2SubstrFrequency[s2.charAt(start) - 97]--;
            start++;
            end++;
            s2SubstrFrequency[s2.charAt(end) - 97]++;

            if (isArrEquals(s1Frequency, s2SubstrFrequency)) {
                return true;
            }
        }

        return false;
    }

    private boolean isArrEquals(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length)
            return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i])
                return false;
        }
        return true;
    }
}
