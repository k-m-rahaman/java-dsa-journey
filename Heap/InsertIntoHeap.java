import java.util.PriorityQueue;

public class InsertIntoHeap {

    public static void main(String[] args) {

        PriorityQueue<Integer> heap = new PriorityQueue<>();

        heap.offer(40);
        heap.offer(20);
        heap.offer(60);

        System.out.println("Heap Before Insertion: " + heap);

        heap.offer(10);

        System.out.println("Heap After Insertion: " + heap);
    }
}