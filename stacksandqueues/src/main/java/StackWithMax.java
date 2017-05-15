import java.util.ArrayList;
import java.util.List;

public class StackWithMax {

    /*
    9.1
    */

    private List<Integer> stack = new ArrayList<>();
    private List<Integer> maxStack = new ArrayList<>();

    public StackWithMax() {

    }

    public Integer max() {
        if (maxStack.size() > 0)
            return maxStack.get(maxStack.size()-1);
        return Integer.MIN_VALUE;
    }

    public Integer pop() {
        if (stack.size()==0) {
            return null;
        }
        Integer x = stack.get(stack.size()-1);
        stack.remove(stack.size()-1);
        if (stack.size() > 0 && x == max() || stack.size() == 0)
            maxStack.remove(maxStack.size() - 1);
        return x;
    }

    public void push(Integer x) {
        if (x >= max())
            maxStack.add(x);
        stack.add(x);
    }
}
