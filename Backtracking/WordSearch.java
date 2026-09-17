public class WordSearch {

    static boolean search(
            char[][] board,
            String word,
            int row,
            int col,
            int index) {

        if (index == word.length()) {
            return true;
        }

        if (row < 0 || row >= board.length
                || col < 0 || col >= board[0].length
                || board[row][col] != word.charAt(index)) {

            return false;
        }

        char original = board[row][col];

        // Mark cell as visited
        board[row][col] = '#';

        boolean found =
                search(board, word, row + 1, col, index + 1)
                || search(board, word, row - 1, col, index + 1)
                || search(board, word, row, col + 1, index + 1)
                || search(board, word, row, col - 1, index + 1);

        // Backtrack
        board[row][col] = original;

        return found;
    }

    static boolean exist(
            char[][] board,
            String word) {

        for (int row = 0; row < board.length; row++) {

            for (int col = 0; col < board[0].length; col++) {

                if (search(
                        board,
                        word,
                        row,
                        col,
                        0)) {

                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {

        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };

        String word = "ABCCED";

        System.out.println(
                "Word exists: "
                        + exist(board, word)
        );
    }
}