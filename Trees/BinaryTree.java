public class BinaryTree {

    static class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    Node root;

    public BinaryTree() {
        root = null;
    }

    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();

        tree.root = new Node(10);

        tree.root.left = new Node(20);
        tree.root.right = new Node(30);

        tree.root.left.left = new Node(40);
        tree.root.left.right = new Node(50);

        System.out.println("Root Node: " + tree.root.data);
        System.out.println("Left Child: " + tree.root.left.data);
        System.out.println("Right Child: " + tree.root.right.data);
    }

}