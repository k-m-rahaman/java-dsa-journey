import java.util.PriorityQueue;

public class PriorityQueueMinHeap {

    public static void main(String[] args) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        minHeap.offer(50);
        minHeap.offer(20);
        minHeap.offer(40);
        minHeap.offer(10);
        minHeap.offer(30);

        System.out.println("Elements in Priority Queue:");

        while (!minHeap.isEmpty()) {
            System.out.print(minHeap.poll() + " ");
        }
    }
}