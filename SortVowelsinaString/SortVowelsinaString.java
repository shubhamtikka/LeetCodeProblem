package SortVowelsinaString;

import java.util.HashSet;
import java.util.PriorityQueue;

public class SortVowelsinaString {
    public String sortVowels(String s) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        HashSet<Character> vovelSet = new HashSet<>();
        vovelSet.add('i');
        vovelSet.add('e');
        vovelSet.add('a');
        vovelSet.add('o');
        vovelSet.add('u');
        vovelSet.add('I');
        vovelSet.add('E');
        vovelSet.add('A');
        vovelSet.add('O');
        vovelSet.add('U');

        for (int i = 0; i < s.length(); i++) {
            if (vovelSet.contains(s.charAt(i))) {
                pq.add((int) s.charAt(i));
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (vovelSet.contains(s.charAt(i))) {
                sb.append((char) (int) pq.poll());
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
