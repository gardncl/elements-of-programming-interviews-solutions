public class ReverseDigits {

    /*
    5.8
    */

    public static long reverse(int x) {
        long returnValue = 0;
        long neg = 1;
        if (x < 0) {
            neg = -1;
            x *= neg;
        }
        while (x !=0 ) {
            returnValue *= 10;
            returnValue += x % 10;
            x /= 10;
        }
        return returnValue * neg;
    }
}
