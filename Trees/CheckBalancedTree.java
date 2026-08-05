public class CheckBalancedTree {

    static class Node {

        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    int height(Node node) {

        if (node == null)
            return 0;

        return Math.max(height(node.left), height(node.right)) + 1;
    }

    boolean isBalanced(Node node) {

        if (node == null)
            return true;

        int left = height(node.left);
        int right = height(node.right);

        return Math.abs(left - right) <= 1
                && isBalanced(node.left)
                && isBalanced(node.right);
    }
}