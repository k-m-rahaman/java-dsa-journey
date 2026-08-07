import java.util.PriorityQueue;

public class DeleteFromHeap {

    public static void main(String[] args) {

        PriorityQueue<Integer> heap = new PriorityQueue<>();

        heap.offer(40);
        heap.offer(10);
        heap.offer(30);
        heap.offer(20);

        System.out.println("Original Heap: " + heap);

        int deleted = heap.poll();

        System.out.println("Deleted Element = " + deleted);

        System.out.println("Heap After Deletion: " + heap);
    }
}