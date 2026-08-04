public class DeleteFromBST {

    static class Node {

        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    Node minValue(Node node) {

        while (node.left != null)
            node = node.left;

        return node;
    }

    Node delete(Node root, int key) {

        if (root == null)
            return null;

        if (key < root.data)
            root.left = delete(root.left, key);

        else if (key > root.data)
            root.right = delete(root.right, key);

        else {

            if (root.left == null)
                return root.right;

            if (root.right == null)
                return root.left;

            Node temp = minValue(root.right);

            root.data = temp.data;

            root.right = delete(root.right, temp.data);
        }

        return root;
    }
}