import java.util.Arrays;

public class BellmanFord {

    static class Edge {

        int source;
        int destination;
        int weight;

        Edge(int source, int destination, int weight) {
            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }
    }

    public static void main(String[] args) {

        int vertices = 5;

        Edge[] edges = {
                new Edge(0, 1, 4),
                new Edge(0, 2, 5),
                new Edge(1, 2, -3),
                new Edge(2, 3, 4),
                new Edge(3, 4, 2)
        };

        int[] distance = new int[vertices];

        Arrays.fill(distance, Integer.MAX_VALUE);

        int source = 0;
        distance[source] = 0;

        // Relax all edges V - 1 times
        for (int i = 1; i < vertices; i++) {

            for (Edge edge : edges) {

                if (distance[edge.source] != Integer.MAX_VALUE
                        && distance[edge.source] + edge.weight
                        < distance[edge.destination]) {

                    distance[edge.destination] =
                            distance[edge.source] + edge.weight;
                }
            }
        }

        // Check for negative cycle
        boolean negativeCycle = false;

        for (Edge edge : edges) {

            if (distance[edge.source] != Integer.MAX_VALUE
                    && distance[edge.source] + edge.weight
                    < distance[edge.destination]) {

                negativeCycle = true;
                break;
            }
        }

        if (negativeCycle) {

            System.out.println("Negative Weight Cycle Detected");

        } else {

            System.out.println("Shortest distances from source " + source + ":");

            for (int i = 0; i < vertices; i++) {

                System.out.println(
                        "Vertex " + i + " = " + distance[i]
                );
            }
        }
    }
}