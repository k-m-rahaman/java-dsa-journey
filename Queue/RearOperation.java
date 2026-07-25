public class RearOperation {

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

    public int rear() {

        if (front > rear) {
            System.out.println("Queue is Empty");
            return -1;
        }

        return queue[rear];
    }

    public static void main(String[] args) {

        RearOperation queue = new RearOperation();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Rear Element = " + queue.rear());
    }
}