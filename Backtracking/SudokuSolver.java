// Solve a 9 × 9 Sudoku board using backtracking.

public class SudokuSolver {

    static boolean isSafe(
            char[][] board,
            int row,
            int col,
            char number) {

        for (int i = 0; i < 9; i++) {

            if (board[row][i] == number) {
                return false;
            }

            if (board[i][col] == number) {
                return false;
            }

            int boxRow = 3 * (row / 3) + i / 3;
            int boxCol = 3 * (col / 3) + i % 3;

            if (board[boxRow][boxCol] == number) {
                return false;
            }
        }

        return true;
    }

    static boolean solve(char[][] board) {

        for (int row = 0; row < 9; row++) {

            for (int col = 0; col < 9; col++) {

                if (board[row][col] == '.') {

                    for (char number = '1';
                         number <= '9';
                         number++) {

                        if (isSafe(
                                board,
                                row,
                                col,
                                number)) {

                            board[row][col] = number;

                            if (solve(board)) {
                                return true;
                            }

                            // Backtrack
                            board[row][col] = '.';
                        }
                    }

                    return false;
                }
            }
        }

        return true;
    }

    static void printBoard(char[][] board) {

        for (char[] row : board) {

            for (char cell : row) {
                System.out.print(cell + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        if (solve(board)) {

            System.out.println("Solved Sudoku:");
            printBoard(board);

        } else {

            System.out.println("No solution exists.");
        }
    }
}