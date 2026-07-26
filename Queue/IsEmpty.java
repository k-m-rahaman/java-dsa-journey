public class IsEmpty {

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

        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        }

        return queue[front++];
    }

    public boolean isEmpty() {

        return front > rear;
    }

    public static void main(String[] args) {

        IsEmpty queue = new IsEmpty();

        System.out.println("Is Queue Empty? " + queue.isEmpty());

        queue.enqueue(10);

        System.out.println("Is Queue Empty? " + queue.isEmpty());

        queue.dequeue();

        System.out.println("Is Queue Empty? " + queue.isEmpty());
    }
}