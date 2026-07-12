public class InsertAtBeginning {

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public void insert(int data) {

        Node newNode = new Node(data);

        newNode.next = head;

        head = newNode;
    }

    public void display() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        InsertAtBeginning list = new InsertAtBeginning();

        list.insert(30);
        list.insert(20);
        list.insert(10);

        list.display();
    }
}