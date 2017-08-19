public class ReplaceAndRemove {

    /*
    7.4
    */

    public static String replaceAndRemove(char[] s, int k) {
        int a = 0, writeIndex = 0;
        for (int i = 0; i < k; i++) {
            if (s[i] != 'b') {
                s[writeIndex++] = s[i];
            }
            if (s[i] == 'a') {
                a++;
            }
        }
        int currentIndex = writeIndex - 1;
        writeIndex = writeIndex + a - 1;
        while (currentIndex >= 0) {
            if (s[currentIndex] == 'a') {
                s[writeIndex--] = 'd';
                s[writeIndex--] = 'd';
            } else {
                s[writeIndex--] = s[currentIndex];
            }
            --currentIndex;
        }
        return String.copyValueOf(s);
    }

}
