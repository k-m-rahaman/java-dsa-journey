import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueMaxHeap {

    public static void main(String[] args) {

        PriorityQueue<Integer> maxHeap =
                new PriorityQueue<>(Collections.reverseOrder());

        maxHeap.offer(20);
        maxHeap.offer(50);
        maxHeap.offer(10);
        maxHeap.offer(40);
        maxHeap.offer(30);

        System.out.println("Max Heap Elements:");

        while (!maxHeap.isEmpty()) {
            System.out.print(maxHeap.poll() + " ");
        }
    }
}