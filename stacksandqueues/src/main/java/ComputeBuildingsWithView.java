import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class ComputeBuildingsWithView {

    /*
    9.6
    */

    public static Deque<BuildingWithHeight> examineBuildingsWithSunset(Iterator<Integer> sequence) {
        Deque<BuildingWithHeight> stack = new ArrayDeque<>();
        int c = 0;
        while (sequence.hasNext()) {
            Integer temp = sequence.next();
            while (stack.peekFirst()!=null && temp >= stack.peekFirst().height) {
                stack.removeFirst();
            }
            stack.addFirst(new BuildingWithHeight(c++,temp));
        }
        return stack;
    }
}
