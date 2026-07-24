public class DequeueOperation {

    int maxSize = 5;
    int[] queue = new int[maxSize];

    int front = 0;
    int rear = -1;

    public void enqueue(int data) {

        if (rear == maxSize - 1) {
            System.out.println("Queue Overflow");
            return;
        }

        queue[++rear] = data;
    }

    public int dequeue() {

        if (front > rear) {
            System.out.println("Queue Underflow");
            return -1;
        }

        return queue[front++];
    }

    public void display() {

        if (front > rear) {
            System.out.println("Queue is Empty");
            return;
        }

        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        DequeueOperation queue = new DequeueOperation();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Removed Element = " + queue.dequeue());

        System.out.println();

        queue.display();
    }
}