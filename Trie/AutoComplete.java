import java.util.*;

public class AutoComplete {

    static class Node {

        Node[] children = new Node[26];
        boolean isEnd;
    }

    static class Trie {

        Node root = new Node();

        void insert(String word) {

            Node current = root;

            for (char ch : word.toCharArray()) {

                int index = ch - 'a';

                if (current.children[index] == null) {
                    current.children[index] = new Node();
                }

                current = current.children[index];
            }

            current.isEnd = true;
        }

        List<String> autocomplete(String prefix) {

            List<String> result = new ArrayList<>();

            Node current = root;

            for (char ch : prefix.toCharArray()) {

                int index = ch - 'a';

                if (current.children[index] == null) {
                    return result;
                }

                current = current.children[index];
            }

            collect(
                    current,
                    prefix,
                    result
            );

            return result;
        }

        void collect(
                Node node,
                String word,
                List<String> result) {

            if (node.isEnd) {
                result.add(word);
            }

            for (int i = 0; i < 26; i++) {

                if (node.children[i] != null) {

                    char next =
                            (char) ('a' + i);

                    collect(
                            node.children[i],
                            word + next,
                            result
                    );
                }
            }
        }
    }

    public static void main(String[] args) {

        Trie trie = new Trie();

        String[] words = {
                "program",
                "programming",
                "project",
                "product",
                "java",
                "javascript"
        };

        for (String word : words) {
            trie.insert(word);
        }

        System.out.println(
                "Suggestions for 'pro': "
                        + trie.autocomplete("pro")
        );
    }
}