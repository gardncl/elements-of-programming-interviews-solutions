public class AddIntegers {

    /*
    8.13
    */

    public static ListNode<Integer> addIntegers(ListNode<Integer> a, ListNode<Integer> b) {
        ListNode<Integer> sum = new ListNode<>(null);
        ListNode<Integer> iter = sum;
        int carry = 0;
        while (a != null || b !=null || carry > 0) {
            int current = carry;
            if (a != null) {
                current += a.data;
                a = a.next;
            }
            if (b != null) {
                current += b.data;
                b = b.next;
            }
            iter.next = new ListNode<>(current % 10);
            iter = iter.next;

            carry = current / 10;
        }

        return sum.next;
    }
}
