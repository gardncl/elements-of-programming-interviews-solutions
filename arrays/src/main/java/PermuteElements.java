import java.util.ArrayList;
import java.util.List;

public class PermuteElements {

    /*
    6.9
    */

    public static void applyPermutation(List<Integer> perm, List<Integer> a) {
        List<Integer> sorted = new ArrayList<>();
        for (int i = 0; i < perm.size(); i++) {
            sorted.add(a.get(perm.get(i)));
        }
        for (int i = 0; i < sorted.size(); i++) {
            a.set(i, sorted.get(i));
        }
    }
}
