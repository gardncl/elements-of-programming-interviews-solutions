public class SpreadsheetColumnEncoding {

    /*
    7.3
    */

    public static int decodeSpreadsheetColumn(String code) {
        int offset = 'A' - 1;
        int result = 0;
        for (char c : code.toCharArray()) {
            result = (result * 26) + (c - offset);
        }
        return result;
    }

}