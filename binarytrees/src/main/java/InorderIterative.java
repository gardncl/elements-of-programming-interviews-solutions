import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InorderIterative {

    /*
    10.7
    */

    public static List<Integer> BSTInOrder(BinaryTree<Integer> node) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<BinaryTree<Integer>> stack = new Stack<>();
        while (!node.isVisited || !stack.isEmpty()) {
            if (node.isVisited)
                node = stack.pop();
            if (node.left != null && !node.left.isVisited) {
                stack.push(node);
                node = node.left;
            } else {
                list.add(node.data);
                node.isVisited = true;
                if (node.right != null)
                    node = node.right;
            }
        }
        return list;
    }
}
