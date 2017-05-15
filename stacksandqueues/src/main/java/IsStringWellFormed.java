import java.util.*;

public class IsStringWellFormed {

    /*
    9.3
    */



    public static boolean isWellFormed(String s) {
        Set<Character> left = new HashSet<>(Arrays.asList('(','[','{'));
        Stack<Character> stack = new Stack<>();
        for (Character c : s.toCharArray()) {
            if (left.contains(c)) {
                stack.push(c);
            } else {
                try {
                    if (c.equals(')')) {
                        if (!stack.pop().equals('('))
                            return false;
                    } else if (c.equals('}')) {
                        if (!stack.pop().equals('{'))
                            return false;
                    } else if (c.equals(']')) {
                        if (!stack.pop().equals('['))
                            return false;
                    } else {
                        return false;
                    }

                } catch (EmptyStackException e) {
                    return false;
                }
            }
        }
        return stack.empty();
    }
}
