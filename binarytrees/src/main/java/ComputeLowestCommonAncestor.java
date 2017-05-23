import java.util.Stack;

public class ComputeLowestCommonAncestor {

    /*
    10.3
    */

    public static BinaryTree<Integer> LCA(BinaryTree<Integer> tree, BinaryTree<Integer> node0, BinaryTree<Integer> node1) {
        Stack<BinaryTree<Integer>> zero = dfs(tree, node0, new Stack<>());
        Stack<BinaryTree<Integer>> one = dfs(tree, node1, new Stack<>());

        //ITERATE BOTH STACKS
        while (!zero.isEmpty() && !one.isEmpty()) {
            if (zero.size() > one.size()) {
                //IF STACK ZERO IS BIGGER GET TO SAME LEVEL AS ONE
                zero.pop();
            } else if (zero.size() < one.size()) {
                //IF STACK ONE IS BIGGER GET TO SAME LEVEL AS ZERO
                one.pop();
            } else {
                //IF STACKS ARE EQUAL SEE IF THEY HAVE THE SAME NODE
                if (zero.peek().equals(one.peek()))
                    return zero.pop();
                zero.pop();
                one.pop();
            }
        }

        return new BinaryTree<>(0);
    }

    private static Stack<BinaryTree<Integer>> dfs(BinaryTree<Integer> tree, BinaryTree<Integer> node, Stack<BinaryTree<Integer>> stack) {
        if (tree == null)
            return stack;
        stack.push(tree);
        if (stack.peek().equals(node)) {
            return stack;
        }

        dfs(tree.left, node, stack);
        if (stack.peek().equals(node)) {
            return stack;
        }

        dfs(tree.right, node, stack);
        if (stack.peek().equals(node)) {
            return stack;
        }

        stack.pop();
        return stack;
    }
}
