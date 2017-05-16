import java.util.Hashtable;
import java.util.concurrent.atomic.AtomicInteger;

public class IsLetterConstructable {

    /*
    13.2
    */

    public static boolean isConstructable(String letterText, String magazineText) {
        Hashtable<Character, AtomicInteger> letters = new Hashtable<>();
        for (Character c : magazineText.toLowerCase().toCharArray()) {
            if (!letters.containsKey(c))
                letters.put(c, new AtomicInteger(1));
            else
                letters.get(c).getAndIncrement();
        }

        for (Character c  : letterText.toLowerCase().toCharArray()) {
            if (!letters.containsKey(c) || letters.get(c).get() == 0)
                return false;
            else
                letters.get(c).getAndDecrement();
        }
        return true;
    }
}
