public class InsertIntoBST {

    static class Node {

        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    Node insert(Node root, int data) {

        if (root == null)
            return new Node(data);

        if (data < root.data)
            root.left = insert(root.left, data);
        else
            root.right = insert(root.right, data);

        return root;
    }

    void inorder(Node root) {

        if (root != null) {

            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {

        InsertIntoBST tree = new InsertIntoBST();

        Node root = null;

        root = tree.insert(root, 40);
        root = tree.insert(root, 20);
        root = tree.insert(root, 60);
        root = tree.insert(root, 10);
        root = tree.insert(root, 30);

        tree.inorder(root);
    }
}