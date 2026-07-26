public class IsFull {

    int maxSize = 5;
    int[] queue = new int[maxSize];

    int front = 0;
    int rear = -1;

    public void enqueue(int data) {

        if (isFull()) {
            System.out.println("Queue Overflow");
            return;
        }

        queue[++rear] = data;
    }

    public boolean isFull() {

        return rear == maxSize - 1;
    }

    public static void main(String[] args) {

        IsFull queue = new IsFull();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        System.out.println("Is Queue Full? " + queue.isFull());

        queue.enqueue(60);
    }
}