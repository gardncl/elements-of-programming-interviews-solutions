public class CircularQueue {

    /*
    9.8
    */

    private int head = 9, tail = 10, numQueueElements = 0;
    private static final int SCALE_FACTOR = 2;
    private Integer[] entries = new Integer[10];

    public CircularQueue(int capacity) {
        this.entries = new Integer[capacity];
    }

    public void enqueue(Integer x) {
        if (tail == 0) {
            resizeBigger();
        }
        entries[--tail] = x;
        ++numQueueElements;
    }

    public Integer dequeue() {
        Integer temp = entries[head];
        entries[head--] = null;
        --numQueueElements;
        return temp;
    }

    public void resizeBigger() {
        Integer[] temp = new Integer[entries.length * SCALE_FACTOR];
        int c = temp.length - numQueueElements;
        for (int i = tail; i <= head; i++) {
            temp[c++] = entries[i];
        }
        entries = temp;
        tail = head - tail + 1; head = temp.length - 1;
    }

    public int size() {
        return numQueueElements;
    }
}
