public class CyclicRightShift {

    /*
    8.9
    */

    public static ListNode<Integer> shift(int k, ListNode<Integer> list) {
        ListNode<Integer> cut = list;
        ListNode<Integer> glue = list;
        if (k == 0)
            return list;
        int length = 1;
        while (glue.next != null) {
            glue = glue.next;
            ++length;
        }
        glue.next = list;
        list = cut.get(length - k).next;
        cut.get(length - k).next = null;
        return list;
    }
}
