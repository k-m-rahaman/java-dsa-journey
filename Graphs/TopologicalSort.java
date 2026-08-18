import java.util.*;

public class TopologicalSort {

    public static void main(String[] args) {

        int vertices = 6;

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }

        graph.get(5).add(2);
        graph.get(5).add(0);

        graph.get(4).add(0);
        graph.get(4).add(1);

        graph.get(2).add(3);

        graph.get(3).add(1);

        int[] indegree = new int[vertices];

        for (int i = 0; i < vertices; i++) {

            for (int neighbor : graph.get(i)) {
                indegree[neighbor]++;
            }
        }

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < vertices; i++) {

            if (indegree[i] == 0) {
                queue.offer(i);
            }
        }

        System.out.print("Topological Sort: ");

        int count = 0;

        while (!queue.isEmpty()) {

            int current = queue.poll();

            System.out.print(current + " ");

            count++;

            for (int neighbor : graph.get(current)) {

                indegree[neighbor]--;

                if (indegree[neighbor] == 0) {
                    queue.offer(neighbor);
                }
            }
        }

        if (count != vertices) {
            System.out.println("\nCycle exists. Topological sort not possible.");
        }
    }
}