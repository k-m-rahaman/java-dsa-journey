import java.util.*;

public class WordBreak {

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
    }

    public static boolean canBreak(
            String word,
            List<String> dictionary) {

        Trie trie = new Trie();

        for (String dictWord : dictionary) {
            trie.insert(dictWord);
        }

        boolean[] dp = new boolean[word.length() + 1];

        dp[0] = true;

        for (int i = 0; i < word.length(); i++) {

            if (!dp[i]) {
                continue;
            }

            Node current = trie.root;

            for (int j = i; j < word.length(); j++) {

                int index = word.charAt(j) - 'a';

                if (current.children[index] == null) {
                    break;
                }

                current = current.children[index];

                if (current.isEnd) {
                    dp[j + 1] = true;
                }
            }
        }

        return dp[word.length()];
    }

    public static void main(String[] args) {

        String word = "leetcode";

        List<String> dictionary = Arrays.asList(
                "leet",
                "code"
        );

        System.out.println(
                "Can word be broken: "
                        + canBreak(word, dictionary)
        );
    }
}