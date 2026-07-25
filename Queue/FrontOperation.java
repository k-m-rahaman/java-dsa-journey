public class FrontOperation {

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

    public int front() {

        if (front > rear) {
            System.out.println("Queue is Empty");
            return -1;
        }

        return queue[front];
    }

    public static void main(String[] args) {

        FrontOperation queue = new FrontOperation();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Front Element = " + queue.front());
    }
}