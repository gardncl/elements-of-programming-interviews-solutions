public class ReverseBits {

    /*
    5.3
    */

    public static int reverse(int x) {
        int i  = 0, j = 31;
        for (int k = 0; k <= 16; k++) {
            x = (int)SwapBits.swapBits(x,i++,j--);
        }
        return x;
    }
}
