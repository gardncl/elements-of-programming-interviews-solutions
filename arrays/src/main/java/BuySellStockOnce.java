import java.util.List;

public class BuySellStockOnce {

    /*
    6.6
    */

    public static int buySellStockOnce(List<Integer> A) {
        Integer profit = 0, min = Integer.MAX_VALUE;
        for (Integer price : A) {
            min = Math.min(min, price);
            profit = Math.max(profit, price - min);
        }
        return profit;
    }
}
