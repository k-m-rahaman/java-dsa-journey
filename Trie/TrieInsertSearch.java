public class TrieInsertSearch {

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

        boolean search(String word) {

            Node current = root;

            for (char ch : word.toCharArray()) {

                int index = ch - 'a';

                if (current.children[index] == null) {
                    return false;
                }

                current = current.children[index];
            }

            return current.isEnd;
        }
    }

    public static void main(String[] args) {

        Trie trie = new Trie();

        trie.insert("cat");
        trie.insert("car");
        trie.insert("dog");

        System.out.println("cat: " + trie.search("cat"));
        System.out.println("car: " + trie.search("car"));
        System.out.println("can: " + trie.search("can"));
        System.out.println("dog: " + trie.search("dog"));
    }
}