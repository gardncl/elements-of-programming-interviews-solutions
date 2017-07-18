import java.util.List;

public class BuySellStockTwice {

    /*
    6.7
    */

    public static int buySellStockTwice(List<Integer> A) {
        int max1 = 0;
        int max2 = 0;
        int least = Integer.MAX_VALUE;
        for (Integer i : A) {
            if (max1 < max2) {
                int swap = max1;
                max1 = max2;
                max2 = swap;
            }
            least = i < least ? i : least;
            max2 = Math.max(max2, i - least);
        }
        return max1 + max2;
    }

}
