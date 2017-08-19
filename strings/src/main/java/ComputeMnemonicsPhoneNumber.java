import java.util.*;

public class ComputeMnemonicsPhoneNumber {

    /*
    7.7
    */


    final private static Map<Character, Optional<List<Character>>> keyMappings;

    public static List<String> computeMnemonics(String phoneNumber) {
        final List<String> numberList = new ArrayList<>();
        computeMnemonics(phoneNumber, "", numberList);
        return numberList;
    }

    private static void computeMnemonics(String phoneNumber, String mnemonics, List<String> numberList) {
        if (phoneNumber.equals("")) {
            numberList.add(mnemonics);
        } else {
            char current = phoneNumber.charAt(0);
            phoneNumber = phoneNumber.substring(1);
            if (keyMappings.get(current).isPresent()) {
                for (char entry: keyMappings.get(current).get()) {
                    computeMnemonics(phoneNumber, mnemonics + entry, numberList);
                }
            } else {
                computeMnemonics(phoneNumber, mnemonics + current, numberList);
            }
        }
    }

    static {
        Map<Character, Optional<List<Character>>> map = new HashMap<>();
        map.put('1', Optional.empty());
        map.put('2', Optional.of(Arrays.asList('A', 'B', 'C')));
        map.put('3', Optional.of(Arrays.asList('D', 'E', 'F')));
        map.put('4', Optional.of(Arrays.asList('G', 'H', 'I')));
        map.put('5', Optional.of(Arrays.asList('J', 'K', 'L')));
        map.put('6', Optional.of(Arrays.asList('M', 'N', 'O')));
        map.put('7', Optional.of(Arrays.asList('P', 'Q', 'R', 'S')));
        map.put('8', Optional.of(Arrays.asList('T', 'U', 'V')));
        map.put('9', Optional.of(Arrays.asList('W', 'X', 'Y', 'Z')));
        map.put('*', Optional.empty());
        map.put('0', Optional.empty());
        map.put('#', Optional.empty());
        keyMappings = Collections.unmodifiableMap(map);
    }

}
