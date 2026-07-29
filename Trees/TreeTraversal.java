public class TreeTraversal {

    static class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    Node root;

    public void preorder(Node node) {

        if (node == null)
            return;

        System.out.print(node.data + " ");

        preorder(node.left);
        preorder(node.right);
    }

    public static void main(String[] args) {

        TreeTraversal tree = new TreeTraversal();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.print("Traversal: ");

        tree.preorder(tree.root);
    }
}