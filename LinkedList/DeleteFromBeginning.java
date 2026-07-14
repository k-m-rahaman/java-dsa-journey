public class DeleteFromBeginning {

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

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode;
    }

    public void delete() {

        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        head = head.next;
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

        DeleteFromBeginning list = new DeleteFromBeginning();

        list.insert(10);
        list.insert(20);
        list.insert(30);

        list.delete();

        list.display();
    }
}