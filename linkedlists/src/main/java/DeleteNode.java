public class DeleteNode {

    /*
    8.6
    */

    public static void deleteNode(ListNode<Integer> node) {
        node.data = node.next.data;
        node.next = node.next.next;
    }

}
