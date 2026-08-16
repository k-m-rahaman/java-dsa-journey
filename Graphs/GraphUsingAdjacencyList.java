import java.util.ArrayList;

public class GraphUsingAdjacencyList {

    public static void main(String[] args) {

        int vertices = 5;

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }

        graph.get(0).add(1);
        graph.get(1).add(0);

        graph.get(0).add(2);
        graph.get(2).add(0);

        graph.get(1).add(3);
        graph.get(3).add(1);

        graph.get(2).add(4);
        graph.get(4).add(2);

        System.out.println("Adjacency List:");

        for (int i = 0; i < vertices; i++) {

            System.out.print(i + " -> ");

            for (int node : graph.get(i)) {
                System.out.print(node + " ");
            }

            System.out.println();
        }
    }
}