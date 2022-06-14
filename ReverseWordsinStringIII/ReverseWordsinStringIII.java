package ReverseWordsinStringIII;

public class ReverseWordsinStringIII {
    public String reverseWords(String s) {
        String[] sArray = s.split(" ");
        StringBuilder reverseWordsStringBuilder = new StringBuilder();

        for (int i = 0; i < sArray.length; i++) {
            reverseWordsStringBuilder.append(reverseString(sArray[i]));
            reverseWordsStringBuilder.append(' ');
        }
        // delete extra appended space
        reverseWordsStringBuilder.deleteCharAt(sArray.length);
        return reverseWordsStringBuilder.toString();
    }

    public String reverseString(String s) {
        StringBuilder reverseStringBuilder = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            reverseStringBuilder.append(s.charAt(i));
        }
        return reverseStringBuilder.toString();
    }
}
