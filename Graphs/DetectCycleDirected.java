import java.util.*;

public class DetectCycleDirected {

    static boolean hasCycle(
            int node,
            ArrayList<ArrayList<Integer>> graph,
            boolean[] visited,
            boolean[] pathVisited) {

        visited[node] = true;
        pathVisited[node] = true;

        for (int neighbor : graph.get(node)) {

            if (!visited[neighbor]) {

                if (hasCycle(neighbor, graph, visited, pathVisited)) {
                    return true;
                }

            } else if (pathVisited[neighbor]) {

                return true;
            }
        }

        pathVisited[node] = false;

        return false;
    }

    public static void main(String[] args) {

        int vertices = 4;

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }

        // Directed cycle:
        // 0 -> 1 -> 2 -> 3 -> 1

        graph.get(0).add(1);
        graph.get(1).add(2);
        graph.get(2).add(3);
        graph.get(3).add(1);

        boolean[] visited = new boolean[vertices];
        boolean[] pathVisited = new boolean[vertices];

        boolean cycleFound = false;

        for (int i = 0; i < vertices; i++) {

            if (!visited[i]) {

                if (hasCycle(i, graph, visited, pathVisited)) {
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