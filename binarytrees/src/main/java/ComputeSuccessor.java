public class ComputeSuccessor {

    /*
    10.10
    */

    public static BinaryTreeParent<Integer> findSuccessor(BinaryTreeParent<Integer> node) {
        if (node.right != null) {
            node = node.right;
            while (node.left != null)
                node = node.left;
            return node;
        }

        if (node.parent != null && node.equals(node.parent.left))
            return node.parent;

        while (node.parent != null && node.equals(node.parent.right))
            node = node.parent;

        return node.parent;
    }
}
