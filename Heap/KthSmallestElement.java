import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestElement {

    public static int findKthSmallest(int[] nums, int k) {

        PriorityQueue<Integer> maxHeap =
                new PriorityQueue<>(Collections.reverseOrder());

        for (int num : nums) {

            maxHeap.offer(num);

            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }

        return maxHeap.peek();
    }

    public static void main(String[] args) {

        int[] nums = {7, 10, 4, 3, 20, 15};

        int k = 3;

        System.out.println("Kth Smallest Element = " + findKthSmallest(nums, k));
    }
}