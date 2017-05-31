import java.util.*;
import java.util.stream.Collectors;

public class MergeSortedFiles {

    /*
    11.1
    */

    private static class ArrayEntry implements Comparable<ArrayEntry>{
        public Integer value;
        public Integer arrayId;

        public ArrayEntry(Integer value, Integer arrayId) {
            this.value = value;
            this.arrayId = arrayId;
        }

        @Override
        public int compareTo(ArrayEntry o) {
            return Integer.compare(value, o.value);
        }
    }

    public static List<Integer> mergeSorted(List<List<Integer>> sortedArrays) {
        List<Iterator<Integer>> iters = new ArrayList<>(sortedArrays.size());
        for (List<Integer> array : sortedArrays)
            iters.add(array.iterator());

        PriorityQueue<ArrayEntry> minHeap = new PriorityQueue<>(iters.size(), ArrayEntry::compareTo);

        for (int i  = 0; i < iters.size(); i++) {
            if (iters.get(i).hasNext())
                minHeap.add(new ArrayEntry(iters.get(i).next(),i));
        }
        List<Integer> result = new ArrayList<>();
        while (!minHeap.isEmpty()) {
            ArrayEntry temp = minHeap.poll();
            result.add(temp.value);
            if (iters.get(temp.arrayId).hasNext())
                minHeap.add(new ArrayEntry(iters.get(temp.arrayId).next(),temp.arrayId));
        }
        return result;
    }
}
