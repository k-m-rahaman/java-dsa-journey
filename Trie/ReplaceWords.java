import java.util.*;

public class ReplaceWords {

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

        String findRoot(String word) {

            Node current = root;

            StringBuilder prefix = new StringBuilder();

            for (char ch : word.toCharArray()) {

                int index = ch - 'a';

                if (current.children[index] == null) {
                    return word;
                }

                prefix.append(ch);
                current = current.children[index];

                if (current.isEnd) {
                    return prefix.toString();
                }
            }

            return word;
        }
    }

    public static String replaceWords(
            List<String> dictionary,
            String sentence) {

        Trie trie = new Trie();

        for (String word : dictionary) {
            trie.insert(word);
        }

        String[] words = sentence.split(" ");

        StringBuilder result = new StringBuilder();

        for (String word : words) {

            if (result.length() > 0) {
                result.append(" ");
            }

            result.append(trie.findRoot(word));
        }

        return result.toString();
    }

    public static void main(String[] args) {

        List<String> dictionary = Arrays.asList(
                "cat",
                "bat",
                "rat"
        );

        String sentence =
                "the cattle was rattled by the battery";

        System.out.println(
                replaceWords(dictionary, sentence)
        );
    }
}