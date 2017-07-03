import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class SortIncDec {

    /*
    11.2
    */

    public static List<Integer> sort(List<Integer> list) {
        List<PriorityQueue<Integer>> priorityQueueList = new ArrayList<>();
        if (list.size() < 2) return list;

        boolean increasing = list.get(0) < list.get(1);
        int e = 0;
        priorityQueueList.add(new PriorityQueue<>(Integer::compareTo));

        for (int i = 1; i < list.size(); i++) {
            if (increasing == (list.get(i-1) < list.get(i))) {
                priorityQueueList.get(e).offer(list.get(i));
            }
        }


        //PUT PRIORITY QUEUES INTO LIST OF LISTS TO BE PROCESSED BY THE SOLUTION TO 11.1
        List<List<Integer>> result = new ArrayList<>();
        for (PriorityQueue<Integer> pq : priorityQueueList) {
            result.add(new ArrayList<>(pq));
        }
        return MergeSortedFiles.mergeSorted(result);
    }
}
