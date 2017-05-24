import java.util.ArrayList;
import java.util.List;

public class SumRootToLeaf {

    /*
    10.5
    */

    public static int sumRootToLeaf(BinaryTree<Integer> tree) {
        List<String> list = new ArrayList<>();
        buildList(tree, list, "");
        int sum = 0;
        for (String s : list)
            sum += convertToInt(s);
        return sum;
    }

    private static int convertToInt(String s) {
        int sum = 0;
        int multiple = 1;
        for (Character c : s.toCharArray()) {
            sum += c.equals('1') ? multiple : 0;
            multiple *= 2;
        }
        return sum;
    }

    private static void buildList(BinaryTree<Integer> node, List<String> list, String s) {
        String temp = s + node.data;
        if (node.left != null || node.right != null) {
            if (node.left != null)
                buildList(node.left, list,temp);
            if (node.right != null)
                buildList(node.right, list,temp);
        } else {
            list.add(temp);
        }
    }
}
