import java.util.*;

public class DijkstraAlgorithm {

    static class Edge {

        int destination;
        int weight;

        Edge(int destination, int weight) {
            this.destination = destination;
            this.weight = weight;
        }
    }

    static class Node implements Comparable<Node> {

        int vertex;
        int distance;

        Node(int vertex, int distance) {
            this.vertex = vertex;
            this.distance = distance;
        }

        @Override
        public int compareTo(Node other) {
            return Integer.compare(this.distance, other.distance);
        }
    }

    static void dijkstra(
            ArrayList<ArrayList<Edge>> graph,
            int source) {

        int vertices = graph.size();

        int[] distance = new int[vertices];

        Arrays.fill(distance, Integer.MAX_VALUE);

        PriorityQueue<Node> pq = new PriorityQueue<>();

        distance[source] = 0;

        pq.offer(new Node(source, 0));

        while (!pq.isEmpty()) {

            Node current = pq.poll();

            int vertex = current.vertex;
            int currentDistance = current.distance;

            if (currentDistance > distance[vertex]) {
                continue;
            }

            for (Edge edge : graph.get(vertex)) {

                int newDistance =
                        currentDistance + edge.weight;

                if (newDistance < distance[edge.destination]) {

                    distance[edge.destination] = newDistance;

                    pq.offer(
                            new Node(
                                    edge.destination,
                                    newDistance
                            )
                    );
                }
            }
        }

        System.out.println("Shortest distances from source " + source + ":");

        for (int i = 0; i < vertices; i++) {

            System.out.println(
                    "Vertex " + i + " = " + distance[i]
            );
        }
    }

    public static void main(String[] args) {

        int vertices = 5;

        ArrayList<ArrayList<Edge>> graph = new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }

        graph.get(0).add(new Edge(1, 4));
        graph.get(0).add(new Edge(2, 1));

        graph.get(2).add(new Edge(1, 2));
        graph.get(1).add(new Edge(3, 1));

        graph.get(2).add(new Edge(3, 5));
        graph.get(3).add(new Edge(4, 3));

        dijkstra(graph, 0);
    }
}