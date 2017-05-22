public class IsHeightBalanced {

    /*
    10.1
    */

    private static class Tuple {
        boolean isHeightBalanced;
        int height;

        public Tuple(boolean isHeightBalanced, int height) {
            this.isHeightBalanced = isHeightBalanced;
            this.height = height;
        }
    }

    public static boolean isBalanced(BinaryTree<Integer> tree) {
        //RECURSE THROUGH TREE AND RETURN IF TREE IS HEIGHT BALANCED
        return isHeightBalanced(tree).isHeightBalanced;
    }

    private static Tuple isHeightBalanced(BinaryTree<Integer> node) {
        //IF NODE IS NULL THEN IT IS HEIGHT BALANCED
        if (node == null)
            return new Tuple(true, 0);

        //GATHER DATA ON THE TWO NODES
        Tuple left = isHeightBalanced(node.left);
        Tuple right = isHeightBalanced(node.right);

        if (node.left == null && node.right == null) {
            //IF LEAF THEN IS HEIGHT BALANCED
            return new Tuple(true, 1);
        } else if (!left.isHeightBalanced || !right.isHeightBalanced) {
            //IF ONE CHILD IS NOT HEIGHT BALANCED THEN NOT HEIGHT BALANCED
            return new Tuple(false, 0);
        } else if (Math.abs(left.height - right.height) > 1) {
            //IF NODES HAVE LARGE GAP THEN NOT HEIGHT BALANCED
            return new Tuple(false, 0);
        } else {
            //IS HEIGHT BALANCED SO RETURN MAX HEIGHT
            return new Tuple(true, Math.max(left.height, right.height) + 1);
        }
    }
}
