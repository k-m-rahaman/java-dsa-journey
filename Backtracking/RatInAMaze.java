public class RatInAMaze {

    static boolean solveMaze(
            int[][] maze,
            int row,
            int col,
            int[][] solution) {

        int n = maze.length;

        if (row == n - 1 && col == n - 1
                && maze[row][col] == 1) {

            solution[row][col] = 1;
            return true;
        }

        if (row >= 0 && row < n
                && col >= 0 && col < n
                && maze[row][col] == 1
                && solution[row][col] == 0) {

            solution[row][col] = 1;

            // Move Down
            if (solveMaze(
                    maze,
                    row + 1,
                    col,
                    solution)) {
                return true;
            }

            // Move Right
            if (solveMaze(
                    maze,
                    row,
                    col + 1,
                    solution)) {
                return true;
            }

            // Move Up
            if (solveMaze(
                    maze,
                    row - 1,
                    col,
                    solution)) {
                return true;
            }

            // Move Left
            if (solveMaze(
                    maze,
                    row,
                    col - 1,
                    solution)) {
                return true;
            }

            // Backtrack
            solution[row][col] = 0;
        }

        return false;
    }

    static void printSolution(int[][] solution) {

        for (int[] row : solution) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] maze = {
                {1, 0, 0, 0},
                {1, 1, 0, 1},
                {0, 1, 0, 0},
                {1, 1, 1, 1}
        };

        int n = maze.length;

        int[][] solution = new int[n][n];

        if (solveMaze(maze, 0, 0, solution)) {

            System.out.println("Path found:");
            printSolution(solution);

        } else {

            System.out.println("No path exists.");
        }
    }
}