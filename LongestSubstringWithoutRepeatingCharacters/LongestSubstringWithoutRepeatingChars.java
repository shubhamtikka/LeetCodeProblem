package LongestSubstringWithoutRepeatingCharacters;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingChars {

    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0)
            return 0;
        if (s.length() == 1)
            return 1;

        int si = 0;
        int lengthOfLongestSubstring = 0;

        HashMap<Character, Integer> charIndexMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (charIndexMap.containsKey(c)) {
                lengthOfLongestSubstring = Math.max(lengthOfLongestSubstring, i - si);
                si = Math.max(si, charIndexMap.get(c) + 1);
            }
            charIndexMap.put(c, i);
        }
        System.out.println(si);
        return Math.max(lengthOfLongestSubstring, s.length() - si);
    }
}
