public class MaximumXOR {

    static class Node {

        Node[] children = new Node[2];
    }

    static class BinaryTrie {

        Node root = new Node();

        void insert(int number) {

            Node current = root;

            for (int bit = 31; bit >= 0; bit--) {

                int value = (number >> bit) & 1;

                if (current.children[value] == null) {
                    current.children[value] = new Node();
                }

                current = current.children[value];
            }
        }

        int getMaximumXOR(int number) {

            Node current = root;
            int result = 0;

            for (int bit = 31; bit >= 0; bit--) {

                int value = (number >> bit) & 1;
                int opposite = 1 - value;

                if (current.children[opposite] != null) {

                    result |= (1 << bit);
                    current = current.children[opposite];

                } else {

                    current = current.children[value];
                }
            }

            return result;
        }
    }

    public static void main(String[] args) {

        int[] numbers = {3, 10, 5, 25, 2, 8};

        BinaryTrie trie = new BinaryTrie();

        for (int number : numbers) {
            trie.insert(number);
        }

        int maximum = 0;

        for (int number : numbers) {

            maximum = Math.max(
                    maximum,
                    trie.getMaximumXOR(number)
            );
        }

        System.out.println(
                "Maximum XOR: " + maximum
        );
    }
}