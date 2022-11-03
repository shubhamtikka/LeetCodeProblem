/*
 * 125. Valid Palindrome
 * 
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, 
 * it reads the same forward and backward. 
 * Alphanumeric characters include letters and numbers. 
 * Given a string s, return true if it is a palindrome, or false otherwise.
 * 
 * 
 */
package ValidPalindrome;

public class ValidPalindrome {

    public boolean isPalindrome(String s) {

        int left = 0, right = s.length() - 1;

        while (left < right) {
            char leftChar = Character.toLowerCase(s.charAt(left));
            char rightChar = Character.toLowerCase(s.charAt(right));

            if (!Character.isLetter(leftChar) && !Character.isDigit(leftChar)) {
                left++;
            } else if (!Character.isLetter(rightChar) && !Character.isDigit(rightChar)) {
                right--;
            } else if (leftChar != rightChar) {
                return false;
            } else {
                left++;
                right--;
            }
        }
        return true;
    }

}
