public class WordDictionary {

    static class Node {

        Node[] children = new Node[26];
        boolean isEnd;
    }

    private final Node root;

    public WordDictionary() {
        root = new Node();
    }

    public void addWord(String word) {

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

    public boolean search(String word) {

        return searchWord(root, word, 0);
    }

    private boolean searchWord(
            Node node,
            String word,
            int index) {

        if (index == word.length()) {
            return node.isEnd;
        }

        char ch = word.charAt(index);

        if (ch == '.') {

            for (Node child : node.children) {

                if (child != null
                        && searchWord(
                        child,
                        word,
                        index + 1)) {

                    return true;
                }
            }

            return false;
        }

        int childIndex = ch - 'a';

        if (node.children[childIndex] == null) {
            return false;
        }

        return searchWord(
                node.children[childIndex],
                word,
                index + 1
        );
    }

    public static void main(String[] args) {

        WordDictionary dictionary =
                new WordDictionary();

        dictionary.addWord("bad");
        dictionary.addWord("dad");
        dictionary.addWord("mad");

        System.out.println(
                "bad: " + dictionary.search("bad")
        );

        System.out.println(
                ".ad: " + dictionary.search(".ad")
        );

        System.out.println(
                "b..: " + dictionary.search("b..")
        );

        System.out.println(
                "pad: " + dictionary.search("pad")
        );
    }
}