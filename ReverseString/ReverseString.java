/*
 * 344. Reverse String
 * Write a function that reverses a string. 
 * The input string is given as an array of characters s.
 * You must do this by modifying the input array in-place with O(1) extra memory.
*/
package ReverseString;

public class ReverseString {

    public void reverseString(char[] s) {
        int startIndex = 0;
        int endIndex = s.length - 1;

        while (startIndex < endIndex) {
            // swap startIndex char and endIndx char
            char temp = s[endIndex];
            s[endIndex] = s[startIndex];
            s[startIndex] = temp;

            startIndex++;
            endIndex--;
        }

    }

}
