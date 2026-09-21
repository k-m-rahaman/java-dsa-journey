import java.util.*;

public class LongestWordInDictionary {

    static class Node {

        Node[] children = new Node[26];
        boolean isEnd;
        String word;
    }

    static Node root = new Node();

    static void insert(String word) {

        Node current = root;

        for (char ch : word.toCharArray()) {

            int index = ch - 'a';

            if (current.children[index] == null) {
                current.children[index] = new Node();
            }

            current = current.children[index];
        }

        current.isEnd = true;
        current.word = word;
    }

    static String findLongestWord() {

        String[] answer = {""};

        dfs(root, answer);

        return answer[0];
    }

    static void dfs(Node node, String[] answer) {

        if (node != root && !node.isEnd) {
            return;
        }

        if (node.word != null) {

            if (node.word.length() > answer[0].length()
                    || (node.word.length() == answer[0].length()
                    && node.word.compareTo(answer[0]) < 0)) {

                answer[0] = node.word;
            }
        }

        for (int i = 0; i < 26; i++) {

            if (node.children[i] != null) {
                dfs(node.children[i], answer);
            }
        }
    }

    public static void main(String[] args) {

        String[] words = {
                "w",
                "wo",
                "wor",
                "worl",
                "world",
                "banana"
        };

        for (String word : words) {
            insert(word);
        }

        System.out.println(
                "Longest valid word: "
                        + findLongestWord()
        );
    }
}