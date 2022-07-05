/*
 * 20. Valid Parentheses
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', 
 * determine if the input string is valid.
 * An input string is valid if:
 * 1. Open brackets must be closed by the same type of brackets.
 * 2. Open brackets must be closed in the correct order.
 * 
 * @param String
 * @return boolean
 */
package ValidParentheses;

import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String s) {

        Stack<Character> opening = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                opening.push(s.charAt(i));
            } else if (s.charAt(i) == ')') {
                Boolean test = !opening.pop().equals('(');
                if (test)
                    return false;
            } else if (s.charAt(i) == ']') {
                if (!opening.pop().equals('['))
                    return false;
            } else if (s.charAt(i) == '}') {
                if (!opening.pop().equals('{'))
                    return false;
            }
        }
        if (!opening.isEmpty())
            return false;
        return true;
    }
}
