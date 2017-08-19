public class FindClosestInteger {

    /*
    5.4
    */

    public static long closestIntSameBitCount(long x) {
        for (int i = 0; i < 62; i++) {
            if (((x >>> i) & 1) != ((x >>> i + 1) & 1)) {
                long MASK = ((1 << i) | (1 << i + 1));
                return x ^ MASK;
            }
        }
        return x;
    }
}
