import java.util.*;

public class TriePrefixSearch {

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

        List<String> wordsWithPrefix(String prefix) {

            List<String> result = new ArrayList<>();

            Node current = root;

            for (char ch : prefix.toCharArray()) {

                int index = ch - 'a';

                if (current.children[index] == null) {
                    return result;
                }

                current = current.children[index];
            }

            collectWords(current, prefix, result);

            return result;
        }

        void collectWords(
                Node node,
                String currentWord,
                List<String> result) {

            if (node.isEnd) {
                result.add(currentWord);
            }

            for (int i = 0; i < 26; i++) {

                if (node.children[i] != null) {

                    char nextChar = (char) ('a' + i);

                    collectWords(
                            node.children[i],
                            currentWord + nextChar,
                            result
                    );
                }
            }
        }
    }

    public static void main(String[] args) {

        Trie trie = new Trie();

        trie.insert("apple");
        trie.insert("application");
        trie.insert("apply");
        trie.insert("banana");
        trie.insert("app");

        System.out.println(
                "Words starting with 'app': "
                        + trie.wordsWithPrefix("app")
        );
    }
}