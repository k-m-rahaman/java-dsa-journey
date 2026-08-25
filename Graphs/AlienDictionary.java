import java.util.*;

public class AlienDictionary {

    public static String findOrder(String[] words, int k) {

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            graph.add(new ArrayList<>());
        }

        int[] indegree = new int[k];

        for (int i = 0; i < words.length - 1; i++) {

            String first = words[i];
            String second = words[i + 1];

            int length =
                    Math.min(first.length(), second.length());

            for (int j = 0; j < length; j++) {

                char a = first.charAt(j);
                char b = second.charAt(j);

                if (a != b) {

                    int u = a - 'a';
                    int v = b - 'a';

                    graph.get(u).add(v);
                    indegree[v]++;

                    break;
                }
            }
        }

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < k; i++) {

            if (indegree[i] == 0) {
                queue.offer(i);
            }
        }

        StringBuilder result = new StringBuilder();

        while (!queue.isEmpty()) {

            int current = queue.poll();

            result.append((char) (current + 'a'));

            for (int neighbor : graph.get(current)) {

                indegree[neighbor]--;

                if (indegree[neighbor] == 0) {
                    queue.offer(neighbor);
                }
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {

        String[] words = {
                "baa",
                "abcd",
                "abca",
                "cab",
                "cad"
        };

        int k = 4;

        System.out.println(
                "Alien Dictionary Order: "
                        + findOrder(words, k)
        );
    }
}