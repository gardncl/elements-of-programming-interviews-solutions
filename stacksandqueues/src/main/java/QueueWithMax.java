import java.util.LinkedList;

public class QueueWithMax {

    /*
    9.10
    */

    LinkedList<Integer> queue = new LinkedList<>();
    LinkedList<Integer> maxQueue = new LinkedList<>();
    Integer temp = Integer.MIN_VALUE;
    Integer max = Integer.MIN_VALUE;

    public void enqueue(Integer x) {
        if (x > temp)
            temp = x;
        else {
            maxQueue.addLast(temp);
            temp = x;
        }
        if (x > max) {
            max = x;
        }
        queue.addLast(x);
    }

    public Integer dequeue() {
        if (queue.peekFirst().equals(maxQueue.peekFirst())) {
            Integer possibleMax = maxQueue.removeFirst();
            if (possibleMax == max) {
                max = maxQueue.peekFirst();
            }
        }
        return queue.removeFirst();
    }

    public Integer max() {
        return max;
    }


}
