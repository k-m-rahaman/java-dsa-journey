public class EnqueueOperation {

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

        System.out.println(data + " inserted into Queue");
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

        EnqueueOperation queue = new EnqueueOperation();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        queue.display();
    }
}