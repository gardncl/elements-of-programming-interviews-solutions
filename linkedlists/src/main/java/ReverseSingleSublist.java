public class ReverseSingleSublist {

    /*
    8.2
    */

    public static ListNode<Integer> reverseSublist(ListNode<Integer> input, int s, int f) {
        ListNode<Integer> dummyNode = new ListNode<>(0, input);
        ListNode<Integer> trail = dummyNode;

        trail = trail.get(s);

        ListNode<Integer> it = trail.next;

        while (s++ < f) {
            ListNode<Integer> front = it.next;
            it.next = front.next;
            front.next = trail.next;
            trail.next = front;
        }

        return dummyNode.next;
    }
}
