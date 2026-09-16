// Place N queens on an N × N chessboard so that no two queens attack each other.


import java.util.*;

public class NQueens {

    static boolean isSafe(
            char[][] board,
            int row,
            int col) {

        int n = board.length;

        // Check column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Check upper-left diagonal
        for (int i = row - 1, j = col - 1;
             i >= 0 && j >= 0;
             i--, j--) {

            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Check upper-right diagonal
        for (int i = row - 1, j = col + 1;
             i >= 0 && j < n;
             i--, j++) {

            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    static void solve(
            char[][] board,
            int row,
            List<List<String>> result) {

        int n = board.length;

        if (row == n) {

            List<String> solution = new ArrayList<>();

            for (char[] currentRow : board) {
                solution.add(new String(currentRow));
            }

            result.add(solution);
            return;
        }

        for (int col = 0; col < n; col++) {

            if (isSafe(board, row, col)) {

                board[row][col] = 'Q';

                solve(board, row + 1, result);

                // Backtrack
                board[row][col] = '.';
            }
        }
    }

    public static void main(String[] args) {

        int n = 4;

        char[][] board = new char[n][n];

        for (char[] row : board) {
            Arrays.fill(row, '.');
        }

        List<List<String>> result = new ArrayList<>();

        solve(board, 0, result);

        System.out.println("Number of solutions: "
                + result.size());

        for (List<String> solution : result) {

            for (String row : solution) {
                System.out.println(row);
            }

            System.out.println();
        }
    }
}