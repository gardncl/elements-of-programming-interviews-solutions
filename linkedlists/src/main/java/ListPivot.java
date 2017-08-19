public class ListPivot {

    /*
    8.12
    */

    public static ListNode<Integer> pivot(ListNode<Integer> list, int k) {
        ListNode<Integer> less = new ListNode<>(0, null);
        ListNode<Integer> equal = new ListNode<>(0, null);
        ListNode<Integer> greater = new ListNode<>(0, null);
        ListNode<Integer> lessIter = less;
        ListNode<Integer> equalIter = equal;
        ListNode<Integer> greaterIter = greater;
        ListNode<Integer> iter = list;

        while (iter != null) {
            if (iter.data < k) {
                lessIter.next = iter;
                lessIter = iter;
            } else if (iter.data == k) {
                equalIter.next = iter;
                equalIter = iter;
            } else {
                greaterIter.next = iter;
                greaterIter = iter;
            }
            iter = iter.next;
        }
        greaterIter.next = null;
        equalIter.next = greater.next;
        lessIter.next = equal.next;

        return less.next;
    }
}
