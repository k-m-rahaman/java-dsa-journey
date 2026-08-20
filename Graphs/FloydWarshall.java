public class FloydWarshall {

    static final int INF = 99999;

    public static void main(String[] args) {

        int[][] graph = {
                {0,   3,   INF, 7},
                {8,   0,   2,   INF},
                {5,   INF, 0,   1},
                {2,   INF, INF, 0}
        };

        int vertices = graph.length;

        int[][] distance = new int[vertices][vertices];

        // Copy graph
        for (int i = 0; i < vertices; i++) {

            for (int j = 0; j < vertices; j++) {

                distance[i][j] = graph[i][j];
            }
        }

        // Floyd-Warshall
        for (int k = 0; k < vertices; k++) {

            for (int i = 0; i < vertices; i++) {

                for (int j = 0; j < vertices; j++) {

                    if (distance[i][k] != INF
                            && distance[k][j] != INF
                            && distance[i][k] + distance[k][j]
                            < distance[i][j]) {

                        distance[i][j] =
                                distance[i][k] + distance[k][j];
                    }
                }
            }
        }

        System.out.println("Shortest Distance Matrix:");

        for (int i = 0; i < vertices; i++) {

            for (int j = 0; j < vertices; j++) {

                if (distance[i][j] == INF) {
                    System.out.print("INF ");
                } else {
                    System.out.print(distance[i][j] + " ");
                }
            }

            System.out.println();
        }
    }
}