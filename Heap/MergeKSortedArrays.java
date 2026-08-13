import java.util.PriorityQueue;

public class MergeKSortedArrays {

    public static void main(String[] args) {

        int[][] arrays = {
                {1, 4, 7},
                {2, 5, 8},
                {3, 6, 9}
        };

        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for (int[] array : arrays) {

            for (int value : array) {

                heap.offer(value);
            }
        }

        System.out.println("Merged Array:");

        while (!heap.isEmpty()) {

            System.out.print(heap.poll() + " ");
        }
    }
}