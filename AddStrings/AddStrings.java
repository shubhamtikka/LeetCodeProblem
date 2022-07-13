/*
 * 415. Add Strings
 * Given two non-negative integers, num1 and num2 represented as string, 
 * return the sum of num1 and num2 as a string.
 * You must solve the problem without using any built-in library for handling large integers (such as BigInteger). 
 * You must also not convert the inputs to integers directly.
 */

package AddStrings;

public class AddStrings {
    public String addStrings(String num1, String num2) {

        if (num1 == "")
            return num2;
        if (num2 == "")
            return num1;
        StringBuilder builder = new StringBuilder();
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int x, y;
        int carry = 0;
        while (i >= 0 || j >= 0) {
            x = (i >= 0) ? num1.charAt(i--) - '0' : 0;
            y = (j >= 0) ? num2.charAt(j--) - '0' : 0;
            builder.insert(0, (x + y + carry) % 10);
            carry = (x + y + carry) >= 10 ? 1 : 0;
        }
        if (carry > 0)
            builder.insert(0, carry);

        return builder.toString();

    }

}
