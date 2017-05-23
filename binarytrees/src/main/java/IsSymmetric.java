import java.util.Iterator;
import java.util.LinkedList;

public class IsSymmetric {

    /*
    10.2
    */

    public static boolean isSymmetric(BinaryTree<Integer> tree) {
        LinkedList<Integer> left = new LinkedList<>();
        LinkedList<Integer> right = new LinkedList<>();
        preOrder(tree.left, left);
        postOrder(tree.right, right);
        Iterator<Integer> leftIt = left.listIterator();
        Iterator<Integer> rightIt = right.listIterator();
        while (leftIt.hasNext() && rightIt.hasNext()) {
            if (!leftIt.next().equals(rightIt.next()))
                return false;
        }
        if (leftIt.hasNext() || rightIt.hasNext())
            return false;
        return true;
    }

    private static void preOrder(BinaryTree<Integer> node, LinkedList<Integer> list) {
        if (node != null) {
            preOrder(node.left, list);
            list.addLast(node.data);
            preOrder(node.right, list);
        }
    }

    private static void postOrder(BinaryTree<Integer> node, LinkedList<Integer> list) {
        if (node != null) {
            postOrder(node.right, list);
            list.addLast(node.data);
            postOrder(node.left, list);
        }
    }

}
