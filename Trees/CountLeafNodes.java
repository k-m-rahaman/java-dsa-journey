public class CountLeafNodes {

    static class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    Node root;

    public int countLeafNodes(Node node) {

        if (node == null)
            return 0;

        if (node.left == null && node.right == null)
            return 1;

        return countLeafNodes(node.left) + countLeafNodes(node.right);
    }

    public static void main(String[] args) {

        CountLeafNodes tree = new CountLeafNodes();

        tree.root = new Node(10);
        tree.root.left = new Node(20);
        tree.root.right = new Node(30);
        tree.root.left.left = new Node(40);
        tree.root.left.right = new Node(50);

        System.out.println("Leaf Nodes = " + tree.countLeafNodes(tree.root));
    }
}