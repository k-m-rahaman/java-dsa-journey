public class LowestCommonAncestor {

    static class Node {

        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    Node lca(Node root, int a, int b) {

        if (root == null)
            return null;

        if (root.data > a && root.data > b)
            return lca(root.left, a, b);

        if (root.data < a && root.data < b)
            return lca(root.right, a, b);

        return root;
    }
}