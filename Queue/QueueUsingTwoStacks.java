import java.util.Stack;

public class QueueUsingTwoStacks {

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void enqueue(int data) {

        stack1.push(data);
    }

    public int dequeue() {

        if (stack1.isEmpty() && stack2.isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        }

        if (stack2.isEmpty()) {

            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.pop();
    }

    public static void main(String[] args) {

        QueueUsingTwoStacks queue = new QueueUsingTwoStacks();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Removed = " + queue.dequeue());

        System.out.println("Removed = " + queue.dequeue());

        queue.enqueue(40);

        System.out.println("Removed = " + queue.dequeue());

        System.out.println("Removed = " + queue.dequeue());
    }
}