import java.util.*;

public class PrimAlgorithm {

    static class Edge {

        int vertex;
        int weight;

        Edge(int vertex, int weight) {
            this.vertex = vertex;
            this.weight = weight;
        }
    }

    static class Node implements Comparable<Node> {

        int vertex;
        int weight;

        Node(int vertex, int weight) {
            this.vertex = vertex;
            this.weight = weight;
        }

        @Override
        public int compareTo(Node other) {
            return Integer.compare(this.weight, other.weight);
        }
    }

    static void prim(ArrayList<ArrayList<Edge>> graph) {

        int vertices = graph.size();

        boolean[] visited = new boolean[vertices];

        PriorityQueue<Node> pq = new PriorityQueue<>();

        pq.offer(new Node(0, 0));

        int totalWeight = 0;

        System.out.println("Edges in Minimum Spanning Tree:");

        while (!pq.isEmpty()) {

            Node current = pq.poll();

            int vertex = current.vertex;

            if (visited[vertex]) {
                continue;
            }

            visited[vertex] = true;

            totalWeight += current.weight;

            if (current.weight != 0) {

                System.out.println(
                        "Vertex " + vertex
                                + " - Weight " + current.weight
                );
            }

            for (Edge edge : graph.get(vertex)) {

                if (!visited[edge.vertex]) {

                    pq.offer(
                            new Node(edge.vertex, edge.weight)
                    );
                }
            }
        }

        System.out.println("Total MST Weight = " + totalWeight);
    }

    public static void main(String[] args) {

        int vertices = 5;

        ArrayList<ArrayList<Edge>> graph = new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }

        addEdge(graph, 0, 1, 2);
        addEdge(graph, 0, 3, 6);
        addEdge(graph, 1, 2, 3);
        addEdge(graph, 1, 3, 8);
        addEdge(graph, 1, 4, 5);
        addEdge(graph, 2, 4, 7);
        addEdge(graph, 3, 4, 9);

        prim(graph);
    }

    static void addEdge(
            ArrayList<ArrayList<Edge>> graph,
            int source,
            int destination,
            int weight) {

        graph.get(source).add(
                new Edge(destination, weight)
        );

        graph.get(destination).add(
                new Edge(source, weight)
        );
    }
}