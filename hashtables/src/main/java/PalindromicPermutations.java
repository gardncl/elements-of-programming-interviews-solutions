import java.util.Hashtable;
import java.util.concurrent.atomic.AtomicInteger;

public class PalindromicPermutations {

    /*
    13.1
    */

    public static boolean canFormPalindrome(String s) {
        Hashtable<Character, AtomicInteger> count = new Hashtable<>();
        for (Character c : s.toLowerCase().toCharArray()) {
            if (!count.containsKey(c))
                count.put(c, new AtomicInteger(1));
            else
                count.get(c).getAndIncrement();
        }
        boolean hasOdd = false;
        for (Character key : count.keySet()) {
            if (count.get(key).get() % 2 != 0)
                if (hasOdd)
                    return false;
                else
                    hasOdd = true;

        }
        return true;
    }
}
