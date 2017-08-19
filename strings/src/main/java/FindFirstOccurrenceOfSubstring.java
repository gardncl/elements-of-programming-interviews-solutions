public class FindFirstOccurrenceOfSubstring {

    /*
    7.13
    */

    public static int findFirst(String string, String substring) {
        int lastIndex = substring.length() - 1;
        for (int i = lastIndex; i < string.length(); i++) {
            if (string.charAt(i) == substring.charAt(lastIndex)) {
                if (substring.equals(string.substring(i - lastIndex,i+1)))
                    return i - lastIndex;
            }
        }
        return -1;
    }

}
