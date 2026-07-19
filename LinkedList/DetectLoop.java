public class DetectLoop {

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node head;

    public void createList() {

        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);

        head = first;

        first.next = second;
        second.next = third;
        third.next = fourth;

        // Creates a loop
        fourth.next = second;
    }

    public boolean hasLoop() {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast)
                return true;
        }

        return false;
    }

    public static void main(String[] args) {

        DetectLoop list = new DetectLoop();

        list.createList();

        if (list.hasLoop())
            System.out.println("Loop Detected");
        else
            System.out.println("No Loop");
    }
}