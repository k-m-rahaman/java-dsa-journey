public class MergeSortedLinkedLists {

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node merge(Node first, Node second) {

        Node dummy = new Node(0);
        Node tail = dummy;

        while (first != null && second != null) {

            if (first.data <= second.data) {

                tail.next = first;
                first = first.next;

            } else {

                tail.next = second;
                second = second.next;
            }

            tail = tail.next;
        }

        if (first != null)
            tail.next = first;

        if (second != null)
            tail.next = second;

        return dummy.next;
    }

    public static void print(Node head) {

        Node temp = head;

        while (temp != null) {

            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Node first = new Node(10);
        first.next = new Node(30);
        first.next.next = new Node(50);

        Node second = new Node(20);
        second.next = new Node(40);
        second.next.next = new Node(60);

        Node merged = merge(first, second);

        print(merged);
    }
}