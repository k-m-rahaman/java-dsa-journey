import java.util.*;

public class ShortestPathInDAG {

    static class Edge {

        int destination;
        int weight;

        Edge(int destination, int weight) {
            this.destination = destination;
            this.weight = weight;
        }
    }

    static void topologicalSort(
            int node,
            ArrayList<ArrayList<Edge>> graph,
            boolean[] visited,
            Stack<Integer> stack) {

        visited[node] = true;

        for (Edge edge : graph.get(node)) {

            if (!visited[edge.destination]) {

                topologicalSort(
                        edge.destination,
                        graph,
                        visited,
                        stack
                );
            }
        }

        stack.push(node);
    }

    static void shortestPath(
            ArrayList<ArrayList<Edge>> graph,
            int source) {

        int vertices = graph.size();

        boolean[] visited = new boolean[vertices];

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < vertices; i++) {

            if (!visited[i]) {
                topologicalSort(
                        i,
                        graph,
                        visited,
                        stack
                );
            }
        }

        int[] distance = new int[vertices];

        Arrays.fill(distance, Integer.MAX_VALUE);

        distance[source] = 0;

        while (!stack.isEmpty()) {

            int current = stack.pop();

            if (distance[current] != Integer.MAX_VALUE) {

                for (Edge edge : graph.get(current)) {

                    if (distance[current] + edge.weight
                            < distance[edge.destination]) {

                        distance[edge.destination] =
                                distance[current]
                                        + edge.weight;
                    }
                }
            }
        }

        System.out.println("Shortest distances from " + source + ":");

        for (int i = 0; i < vertices; i++) {

            if (distance[i] == Integer.MAX_VALUE) {

                System.out.println(
                        "Vertex " + i + " = INF"
                );

            } else {

                System.out.println(
                        "Vertex " + i
                                + " = " + distance[i]
                );
            }
        }
    }

    public static void main(String[] args) {

        int vertices = 6;

        ArrayList<ArrayList<Edge>> graph = new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }

        graph.get(0).add(new Edge(1, 2));
        graph.get(0).add(new Edge(4, 1));

        graph.get(1).add(new Edge(2, 3));

        graph.get(2).add(new Edge(3, 6));

        graph.get(4).add(new Edge(2, 2));
        graph.get(4).add(new Edge(5, 4));

        graph.get(5).add(new Edge(3, 1));

        shortestPath(graph, 0);
    }
}