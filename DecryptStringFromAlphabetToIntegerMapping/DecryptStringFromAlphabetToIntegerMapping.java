package DecryptStringFromAlphabetToIntegerMapping;

public class DecryptStringFromAlphabetToIntegerMapping {

    public String freqAlphabets(String s) {
        int pointer = s.length() - 1;
        StringBuilder builder = new StringBuilder();
        while (pointer >= 0) {
            char c = s.charAt(pointer);
            if (c == '#') {
                char firstDigit = s.charAt(pointer - 1);
                char secondDigit = s.charAt(pointer - 2);
                if (secondDigit == '1')
                    builder.append((char) (firstDigit + secondDigit + (9)));
                else // second digit will be '2'
                    builder.append((char) (firstDigit + secondDigit + (18)));

                pointer = pointer - 3;
            } else {
                builder.append((char) (s.charAt(pointer) + 48));
                pointer = pointer - 1;
            }
        }
        return builder.reverse().toString();
    }
}
