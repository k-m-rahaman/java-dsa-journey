import java.util.*;

public class DetectCycleUndirected {

    static boolean hasCycle(
            int node,
            int parent,
            ArrayList<ArrayList<Integer>> graph,
            boolean[] visited) {

        visited[node] = true;

        for (int neighbor : graph.get(node)) {

            if (!visited[neighbor]) {

                if (hasCycle(neighbor, node, graph, visited)) {
                    return true;
                }

            } else if (neighbor != parent) {

                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int vertices = 5;

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }

        // Create cycle:
        // 0 -- 1
        // |    |
        // 2 -- 3
        //      |
        //      4

        graph.get(0).add(1);
        graph.get(1).add(0);

        graph.get(0).add(2);
        graph.get(2).add(0);

        graph.get(1).add(3);
        graph.get(3).add(1);

        graph.get(2).add(3);
        graph.get(3).add(2);

        graph.get(3).add(4);
        graph.get(4).add(3);

        boolean[] visited = new boolean[vertices];

        boolean cycleFound = false;

        for (int i = 0; i < vertices; i++) {

            if (!visited[i]) {

                if (hasCycle(i, -1, graph, visited)) {
                    cycleFound = true;
                    break;
                }
            }
        }

        if (cycleFound) {
            System.out.println("Cycle Detected");
        } else {
            System.out.println("No Cycle");
        }
    }
}