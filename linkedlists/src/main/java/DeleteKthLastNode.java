public class DeleteKthLastNode {

    /*
    8.7
    */

    public static void deleteNode(ListNode<Integer> list, int k) {
        ListNode<Integer> trail = list;

        //IF K IS AT THE END OF THE LIST THEN REMOVE LAST ELEMENT
        if (k <= 1) {
            while (trail.next.next != null) {
                trail = trail.next;
            }
            trail.next = null;
            return;
        }

        //FIND END OF LIST AND TRAIL WILL BE A KTH ELEMENT
        ListNode<Integer> lead = list.get(k);
        while (lead.next != null) {
            trail = trail.next;
            lead = lead.next;
        }
        deleteNode(trail);
    }

    private static void deleteNode(ListNode<Integer> node) {
        node.data = node.next.data;
        node.next = node.next.next;
    }

}
