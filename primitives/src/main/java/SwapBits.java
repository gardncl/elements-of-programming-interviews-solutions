public class SwapBits {

    /*
    5.2
    */

    public static long swapBits(long x, int i, int j) {
        if (((x >>> i) & 1) != ((x >>> j) & 1)) {
            final long MASK = (1 << i) | (1 << j);
            x ^= MASK;
        }
        return x;
    }
}
