public class SearchPostingsList {

    /*
    9.5
    */

    public static void setJumpOrderRecursive(PostingListNode<Integer> node) {
        setJumpOrderRecursive(node, 0);
    }

    private static int setJumpOrderRecursive(PostingListNode<Integer> node, int order) {
        if (node != null && node.data == -1) {
            node.data = order++;
            order = setJumpOrderRecursive(node.jump, order);
            order = setJumpOrderRecursive(node.next, order);
        }
        return order;
    }

    public static void setJumpOrderIterative(PostingListNode<Integer> node) {

    }
}
