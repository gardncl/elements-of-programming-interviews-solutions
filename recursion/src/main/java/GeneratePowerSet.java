import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class GeneratePowerSet {

    /*
    16.4
    */

    public static List<List<Integer>> generatePowerSet(List<Integer> inputSet) {
        List<List<Integer>> powerSet = new ArrayList<>();
        generatePowerSetRecurse(inputSet.iterator(), powerSet);
        powerSet.add(Collections.singletonList(-1));
        return powerSet;
    }

    private static void generatePowerSetRecurse(Iterator<Integer> inputSet, List<List<Integer>> powerSet) {
        Integer current = inputSet.next();
        if (inputSet.hasNext()) {
            generatePowerSetRecurse(inputSet, powerSet);
        }
        List<List<Integer>> resultSet = new ArrayList<>();
        for (List<Integer> entry : powerSet) {
            List<Integer> list = new ArrayList<>();
            list.addAll(entry);
            list.add(current);
            resultSet.add(list);
        }
        powerSet.addAll(resultSet);
        powerSet.add(Arrays.asList(current));
    }
}
