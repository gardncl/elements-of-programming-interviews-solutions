import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GeneratePermutations {

    /*
    16.3
    */

    public static List<List<Integer>> permutations(List<Integer> A) {
        List<List<Integer>> permutations = new ArrayList<>();
        permutationsRecurse(0,A,permutations);
        return permutations;
    }

    private static void permutationsRecurse(int i, List<Integer> A, List<List<Integer>> result) {
        //IF I IS AT THE END OF THE LIST RETURN THE FULLY FORMED LIST
        if (i == A.size() - 1) {
            result.add(new ArrayList<>(A));
            return;
        }

        //GENERATE ALL PERMUTATIONS BY SWAPPING THE iTH ELEMENT AND THEN RECURSE ON THE REST OF THE LIST
        for (int j = i; j < A.size(); ++j) {
            Collections.swap(A,i,j);
            permutationsRecurse(i+1,A,result);
            Collections.swap(A,i,j);
        }
    }

}
