public class ComputeLCAWithParent {

    /*
    10.4
    */

    public static BinaryTreeParent<Integer> LCA(BinaryTreeParent<Integer> node0, BinaryTreeParent<Integer> node1) {
        int zeroHeight = findDepth(node0);
        int oneHeight = findDepth(node1);
        try {
            while (!node0.equals(node1)) {
                if (zeroHeight > oneHeight) {
                    node0 = node0.parent;
                    --zeroHeight;
                } else if (zeroHeight < oneHeight) {
                    node1 = node1.parent;
                    --oneHeight;
                } else {
                    node0 = node0.parent;
                    node1 = node1.parent;
                }
            }
        } catch (NullPointerException e) {
            return null;
        }

        return node0;
    }

    private static int findDepth(BinaryTreeParent<Integer> node) {
        if (node!=null) {
            return 1 + findDepth(node.parent);
        }
        return 0;
    }
}
