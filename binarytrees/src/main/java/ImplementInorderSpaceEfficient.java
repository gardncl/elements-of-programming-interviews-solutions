import java.util.ArrayList;
import java.util.List;

public class ImplementInorderSpaceEfficient {

    /*
    10.11
    */

    public static List<Integer> inorderTraversal(BinaryTreeParent<Integer> node) {
        ArrayList<Integer> list = new ArrayList<>();
        BinaryTreeParent<Integer> prev = null;
        while (node!=null) {
            BinaryTreeParent<Integer> next;
            if (node.parent == prev) {
                if (node.left != null) {
                    next = node.left;
                } else {
                    list.add(node.data);
                    next = (node.right != null) ? node.right : node.parent;
                }
            } else if (node.left == prev) {
                list.add(node.data);
                next = (node.right != null) ? node.right : node.parent;
            } else {
                next = node.parent;
            }

            prev = node;
            node = next;
        }
        return list;
    }
}
