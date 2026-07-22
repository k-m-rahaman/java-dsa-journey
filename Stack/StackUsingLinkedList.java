public class StackUsingLinkedList {

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node top;

    public void push(int data) {

        Node newNode = new Node(data);

        newNode.next = top;

        top = newNode;
    }

    public int pop() {

        if (top == null) {
            System.out.println("Stack Underflow");
            return -1;
        }

        int value = top.data;

        top = top.next;

        return value;
    }

    public int peek() {

        if (top == null) {
            System.out.println("Stack is Empty");
            return -1;
        }

        return top.data;
    }

    public void display() {

        Node temp = top;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        StackUsingLinkedList stack = new StackUsingLinkedList();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top Element = " + stack.peek());

        System.out.println("Popped = " + stack.pop());

        stack.display();
    }
}