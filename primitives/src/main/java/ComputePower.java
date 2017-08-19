public class ComputePower {

    /*
    5.7
    */

    public static double power(double x, int y) {
        double result = 1;
        if (y < 0) {
            y *= -1;
            x = 1/x;
        }
        while (y != 0) {
            if ((y & 1) == 1)
                result *= x;
            x *= x;
            y >>= 1;
        }
        return result;
    }
}
