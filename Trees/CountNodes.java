public class CountNodes {

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

    public int countNodes(Node node) {

        if (node == null)
            return 0;

        return 1 + countNodes(node.left) + countNodes(node.right);
    }

    public static void main(String[] args) {

        CountNodes tree = new CountNodes();

        tree.root = new Node(10);
        tree.root.left = new Node(20);
        tree.root.right = new Node(30);
        tree.root.left.left = new Node(40);
        tree.root.left.right = new Node(50);

        System.out.println("Total Nodes = " + tree.countNodes(tree.root));
    }
}