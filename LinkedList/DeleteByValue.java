public class DeleteByValue {

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
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

    public void delete(int value) {

        if (head == null)
            return;

        if (head.data == value) {
            head = head.next;
            return;
        }

        Node temp = head;

        while (temp.next != null && temp.next.data != value)
            temp = temp.next;

        if (temp.next != null)
            temp.next = temp.next.next;
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

        DeleteByValue list = new DeleteByValue();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        list.delete(30);

        list.display();
    }
}