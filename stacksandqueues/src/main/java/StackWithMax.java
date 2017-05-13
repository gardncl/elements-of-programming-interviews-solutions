import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StackWithMax {

    /*
    9.1
    */

    private Integer max = 0;
    private List<Integer> stack = new ArrayList<>();

    public StackWithMax() {

    }

    public Integer max() {
        return max;
    }

    public Integer pop() {
        if (stack.size()==0) {
            return null;
        }
        Integer x = stack.get(stack.size()-1);
        stack.remove(stack.size()-1);
        if (stack.size() > 0 && x == max())
            max = Collections.max(stack);
        else if (stack.size() == 0)
            max = 0;
        return x;
    }

    public void push(Integer x) {
        if (x > max())
            max = x;
        stack.add(x);
    }
}
