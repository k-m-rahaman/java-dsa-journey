public class TrieImplementation {

    static class TrieNode {

        TrieNode[] children = new TrieNode[26];
        boolean isEndOfWord;

        TrieNode() {
            isEndOfWord = false;
        }
    }

    static class Trie {

        private final TrieNode root;

        Trie() {
            root = new TrieNode();
        }

        void insert(String word) {

            TrieNode current = root;

            for (char ch : word.toCharArray()) {

                int index = ch - 'a';

                if (current.children[index] == null) {
                    current.children[index] = new TrieNode();
                }

                current = current.children[index];
            }

            current.isEndOfWord = true;
        }

        boolean search(String word) {

            TrieNode node = findNode(word);

            return node != null && node.isEndOfWord;
        }

        boolean startsWith(String prefix) {

            return findNode(prefix) != null;
        }

        private TrieNode findNode(String word) {

            TrieNode current = root;

            for (char ch : word.toCharArray()) {

                int index = ch - 'a';

                if (current.children[index] == null) {
                    return null;
                }

                current = current.children[index];
            }

            return current;
        }
    }

    public static void main(String[] args) {

        Trie trie = new Trie();

        trie.insert("apple");
        trie.insert("app");
        trie.insert("apply");

        System.out.println("Search apple: "
                + trie.search("apple"));

        System.out.println("Search app: "
                + trie.search("app"));

        System.out.println("Search ap: "
                + trie.search("ap"));

        System.out.println("Prefix appl: "
                + trie.startsWith("appl"));
    }
}