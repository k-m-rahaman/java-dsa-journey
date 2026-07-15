public class SearchNode {

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

    public boolean search(int key) {

        Node temp = head;

        while (temp != null) {

            if (temp.data == key)
                return true;

            temp = temp.next;
        }

        return false;
    }

    public static void main(String[] args) {

        SearchNode list = new SearchNode();

        list.insert(10);
        list.insert(20);
        list.insert(30);

        System.out.println(list.search(20));
        System.out.println(list.search(100));
    }
}