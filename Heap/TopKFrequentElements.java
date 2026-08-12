import java.util.*;

public class TopKFrequentElements {

    public static void main(String[] args) {

        int[] nums = {1, 1, 1, 2, 2, 3};

        int k = 2;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> heap =
                new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));

        heap.addAll(map.keySet());

        System.out.println("Top " + k + " Frequent Elements:");

        for (int i = 0; i < k; i++) {
            System.out.print(heap.poll() + " ");
        }
    }
}