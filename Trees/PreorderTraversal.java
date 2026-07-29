public class PreorderTraversal {

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

        PreorderTraversal tree = new PreorderTraversal();

        tree.root = new Node(10);
        tree.root.left = new Node(20);
        tree.root.right = new Node(30);
        tree.root.left.left = new Node(40);
        tree.root.left.right = new Node(50);

        System.out.print("Preorder: ");

        tree.preorder(tree.root);
    }
}