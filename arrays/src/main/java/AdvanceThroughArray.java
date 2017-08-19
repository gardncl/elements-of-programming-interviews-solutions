import java.util.List;

public class AdvanceThroughArray {

    /*
       6.4
    */

    public static boolean arrayAdvance(List<Integer> A) {
        int steps = 0, count = 0, length = A.size() - 1;
        while (steps >= 0) {
            //UPDATE TOTAL NUMBER OF STEPS IF GREATER THAN STORED
            if (A.get(count) > steps) {
                steps = A.get(count);
            }
            steps--;
            count++;

            //IF YOU CAN REACH THE LAST INDEX THEN RETURN TRUE
            if (count + steps >= length)
                return true;
        }
        return false;
    }
}
