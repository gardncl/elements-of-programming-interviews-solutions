public class FindRootToLeafSum {

    /*
    10.6
    */

    public static boolean hasPathSum(BinaryTree<Integer> tree, Integer targetSum) {
        return exists(tree, targetSum, 0);
    }

    private static boolean exists(BinaryTree<Integer> node, Integer targetSum, Integer count) {
        if (node == null)
            return false;

        int current = node.data + count;
        if (node.left == null && node.right == null)
            return targetSum.equals(current);

        return exists(node.left, targetSum, current) ||
                exists(node.right, targetSum, current);
    }

}
