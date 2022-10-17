/*
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
    * Symbol       Value
    * I             1
    * V             5
    * X             10
    * L             50
    * C             100
    * D             500
    * M             1000
 * 
 *  1 <= num <= 3999
 */

package IntegerToRoman;

public class IntegerToRoman {

    int[] val = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
    String[] code = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

    public String intToRoman(int num) {

        StringBuilder sb = new StringBuilder();

        while (num > 0) {

            for (int i = 0; i < 13; i++) {

                if (num >= val[i]) {

                    num -= val[i];
                    sb.append(code[i]);
                    break;
                }
            }
        }

        return sb.toString();

    }
}
