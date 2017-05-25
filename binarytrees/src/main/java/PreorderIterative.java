import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class PreorderIterative {

    /*
    10.8
    */

    public static List<Integer> BSTPreOrder(BinaryTree<Integer> node) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<BinaryTree<Integer>> stack = new Stack();

        while (!node.isVisited || !stack.isEmpty()) {
            if (node.isVisited)
                node = stack.pop();
            list.add(node.data);
            node.isVisited = true;

            if (node.right != null && !node.right.isVisited)
                stack.push(node.right);

            if (node.left != null && !node.left.isVisited)
                node = node.left;
        }
        return list;
    }
}
