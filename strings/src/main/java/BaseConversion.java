public class BaseConversion {

    /*
    7.2
    */

    public static String baseConversion(String s, int b1, int b2) {
        char[] c = s.toCharArray();
        boolean neg = c[0] == '-';
        int total = 0;
        for (int i = neg ? 1 : 0; i < c.length; i++) {
            total *= b1;
            total += Character.isDigit(c[i])
                    ?c[i] - '0' : c[i] - 'A' + 10 ;
        }
        return (neg ? "-" :  "") + baseConvert(total, b2);
    }

    private static String baseConvert(int total, int base) {
        int curr = total % base;
        return total == 0 ? "" : baseConvert(total / base, base) +
                (char)(curr > 9 ? 'A' + curr - 10 : curr + '0' );
    }
}
