import java.util.Stack;

public class QueueWithStacks {

    /*
    9.9
    */

    private Stack<Integer> push = new Stack<>();
    private Stack<Integer> pop = new Stack<>();

    public QueueWithStacks() {
    }

    public void enqueue(Integer x) {
        if (!pop.isEmpty())
            preparePush();
        push.push(x);
    }

    public Integer dequeue() {
        if (!push.isEmpty())
            preparePop();
        return pop.pop();
    }

    private void preparePush() {
        while (!pop.isEmpty()) {
            push.push(pop.pop());
        }
    }

    private void preparePop() {
        while (!push.isEmpty()) {
            pop.push(push.pop());
        }
    }
}
