import java.util.Hashtable;

public class IsLetterConstructable {

    /*
    13.2
    */

    public static boolean isConstructable(String letterText, String magazineText) {
        Hashtable<Character, Integer> letters = new Hashtable<>();
        for (Character c : magazineText.toLowerCase().toCharArray()) {
            if (!letters.containsKey(c))
                letters.put(c,1);
            else
                letters.put(c, letters.get(c)+1);
        }

        for (Character c  : letterText.toLowerCase().toCharArray()) {
            if (!letters.containsKey(c) || letters.get(c) == 0)
                return false;
            else
                letters.put(c, letters.get(c)-1);
        }
        return true;
    }
}
