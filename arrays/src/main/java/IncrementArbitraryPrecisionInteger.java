import java.util.List;

public class IncrementArbitraryPrecisionInteger {

    /*
    6.2
    */

    public static List<Integer> incrementInteger(List<Integer> A) {
        for (int l = A.size() - 1; l >= 0; --l) {
            //IF OVERFLOW THEN SET CURRENT TO ZERO AND CONTINUE TO NEXT ELEMENT
            if (A.get(l) + 1 == 10) {
                A.set(l,0);
                //NO OVERFLOW SO END HERE
            } else {
                A.set(l, A.get(l) + 1);
                break;
            }
        }
        return A;
    }
}
