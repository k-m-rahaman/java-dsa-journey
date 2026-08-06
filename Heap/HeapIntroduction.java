public class HeapIntroduction {

    public static void main(String[] args) {

        int[] maxHeap = {50, 40, 30, 20, 10, 15, 5};

        System.out.println("Max Heap Elements:");

        for (int element : maxHeap) {
            System.out.print(element + " ");
        }

        System.out.println();

        System.out.println("\nRoot Node = " + maxHeap[0]);
        System.out.println("Left Child = " + maxHeap[1]);
        System.out.println("Right Child = " + maxHeap[2]);
    }
}