package MinimumDeletions;

import java.util.HashMap;
import java.util.HashSet;

public class MinimumDeletions {
    public int minDeletions(String s) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        HashSet<Integer> countSet = new HashSet<>();

        int deletions = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }

        for (char c : charCountMap.keySet()) {
            int countofKey = charCountMap.get(c);
            if (countSet.contains(countofKey)) {
                while (countofKey > 0) {
                    countofKey--;
                    deletions++;
                    if (!countSet.contains(countofKey)) {
                        countSet.add(countofKey);
                        break;
                    }
                }
            } else {
                countSet.add(countofKey);
            }
        }

        return deletions;
    }
}
