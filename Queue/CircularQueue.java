public class CircularQueue {

    int maxSize = 5;
    int[] queue = new int[maxSize];

    int front = -1;
    int rear = -1;

    public void enqueue(int data) {

        if ((rear + 1) % maxSize == front) {
            System.out.println("Queue Overflow");
            return;
        }

        if (front == -1)
            front = 0;

        rear = (rear + 1) % maxSize;
        queue[rear] = data;
    }

    public int dequeue() {

        if (front == -1) {
            System.out.println("Queue Underflow");
            return -1;
        }

        int value = queue[front];

        if (front == rear) {

            front = -1;
            rear = -1;

        } else {

            front = (front + 1) % maxSize;
        }

        return value;
    }

    public void display() {

        if (front == -1) {
            System.out.println("Queue is Empty");
            return;
        }

        int i = front;

        while (true) {

            System.out.print(queue[i] + " ");

            if (i == rear)
                break;

            i = (i + 1) % maxSize;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        CircularQueue queue = new CircularQueue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        queue.display();

        System.out.println("Removed = " + queue.dequeue());

        queue.enqueue(60);

        queue.display();
    }
}