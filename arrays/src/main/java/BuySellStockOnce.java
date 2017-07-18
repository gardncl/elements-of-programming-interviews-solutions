import java.util.List;

public class BuySellStockOnce {

    /*
    6.6
    */

    public static int buySellStockOnce(List<Integer> A) {
        int maximum = 0;
        int least = Integer.MAX_VALUE;
        for (Integer i : A) {
            least = i < least ? i : least;
            maximum = Math.max(maximum, i - least);
        }
        return maximum;
    }
}
