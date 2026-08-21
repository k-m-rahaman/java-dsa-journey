import java.util.*;

public class KruskalAlgorithm {

    static class Edge implements Comparable<Edge> {

        int source;
        int destination;
        int weight;

        Edge(int source, int destination, int weight) {
            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }

        @Override
        public int compareTo(Edge other) {
            return Integer.compare(this.weight, other.weight);
        }
    }

    static int[] parent;
    static int[] rank;

    static void makeSet(int vertices) {

        parent = new int[vertices];
        rank = new int[vertices];

        for (int i = 0; i < vertices; i++) {
            parent[i] = i;
        }
    }

    static int find(int vertex) {

        if (parent[vertex] != vertex) {
            parent[vertex] = find(parent[vertex]);
        }

        return parent[vertex];
    }

    static boolean union(int a, int b) {

        int rootA = find(a);
        int rootB = find(b);

        if (rootA == rootB) {
            return false;
        }

        if (rank[rootA] < rank[rootB]) {
            parent[rootA] = rootB;
        } else if (rank[rootA] > rank[rootB]) {
            parent[rootB] = rootA;
        } else {
            parent[rootB] = rootA;
            rank[rootA]++;
        }

        return true;
    }

    public static void main(String[] args) {

        int vertices = 5;

        ArrayList<Edge> edges = new ArrayList<>();

        edges.add(new Edge(0, 1, 2));
        edges.add(new Edge(0, 3, 6));
        edges.add(new Edge(1, 2, 3));
        edges.add(new Edge(1, 3, 8));
        edges.add(new Edge(1, 4, 5));
        edges.add(new Edge(2, 4, 7));
        edges.add(new Edge(3, 4, 9));

        Collections.sort(edges);

        makeSet(vertices);

        int totalWeight = 0;
        int edgeCount = 0;

        System.out.println("Edges in Minimum Spanning Tree:");

        for (Edge edge : edges) {

            if (union(edge.source, edge.destination)) {

                System.out.println(
                        edge.source + " - "
                                + edge.destination
                                + " : " + edge.weight
                );

                totalWeight += edge.weight;
                edgeCount++;

                if (edgeCount == vertices - 1) {
                    break;
                }
            }
        }

        System.out.println("Total MST Weight = " + totalWeight);
    }
}